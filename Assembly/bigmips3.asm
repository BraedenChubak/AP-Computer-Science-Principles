########################################################################
# Description:
# Input an integer and check whether it is even or odd
#
# Arguments:
#
# Returns:
########################################################################

.data
prompt: .asciiz "Input an Integer: "
even: .asciiz "This is even."
odd: .asciiz "This is odd."

.text
main:
	# Get user integer
	la $a0, prompt		# print_str(prompt)
	li $v0, 4
	syscall
	li $v0, 5			# v0 = read_int()
	syscall
	move $t0, $v0		# t0 = v0
	
	# Mod divide
	li $t1, 2			# t1 = 2
	div $t0, $t1
	mfhi $t2
	beq $t2, 0, do_even
do_odd:
	la $a0, odd		# print_str(prtwin)
	li $v0, 4
	syscall
	j exit
do_even:
	la $a0, even		# print_str(prtwin)
	li $v0, 4
	syscall
exit:
	li $v0, 10
	syscall