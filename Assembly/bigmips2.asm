########################################################################
# Description:
# Input two numbers and display their sum and difference
#
# Arguments:
#
# Returns:
########################################################################

.data
msg_sum: .asciiz "The sum is:\t"
msg_dif: .asciiz "\nThe diff is:\t"
msg_in1: .asciiz "Enter int 1: "
msg_in2: .asciiz "Enter int 2: "

.text
main:
	# input 1
	la $a0, msg_in1
	li $v0, 4			# print a0
	syscall
	
	li $v0, 5  		# v0 = input
	syscall
	move $t0, $v0
	
	# input 2
	la $a0, msg_in2
	li $v0, 4			# print a0
	syscall
	
	li $v0, 5  		# v0 = input
	syscall
	move $t1, $v0
	
	# sum and diff
	add $t2, $t0, $t1	# t2 = t0 + t1
	sub $t3, $t0, $t1	# t3 = t0 - t1
	
	# print output
	la $a0, msg_sum
	li $v0, 4			# print_str a0
	syscall
	move $a0, $t2		# a0 = t2
	li $v0, 1			# print_int a0
	syscall
	
	la $a0, msg_dif
	li $v0, 4			# print_str a0
	syscall
	move $a0, $t3		# a0 = t3
	li $v0, 1			# print_int a0
	syscall
	
exit:
	li $v0 10		# Return 0
	syscall
	