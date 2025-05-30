.data
prompt1: .asciiz "Enter integer 1: "
prompt2: .asciiz "Enter integer 2: "
prompt3: .asciiz "Enter integer 3: "
space: .asciiz " "
.text
main:
	# int1
	la $a0, prompt1
	li $v0, 4			# print_str(prompt1)
	syscall
	li $v0, 5			# read_int()
	syscall
	move $t0, $v0
	
	# int2
	la $a0, prompt2
	li $v0, 4			# print_str(prompt2)
	syscall
	li $v0, 5			# read_int()
	syscall
	move $t1, $v0
	
	# int3
	la $a0, prompt3
	li $v0, 4			# print_str(prompt3)
	syscall
	li $v0, 5			# read_int()
	syscall
	move $t2, $v0
	
	move $a0, $t0
	move $a1, $t1
	move $a2, $t2
	
	jal order3
	
	li $v0, 1			# print_int(a0)
	syscall
	
	la $a0, space
	li $v0, 4			# print_str(space)
	syscall
	
	move $a0, $a1
	li $v0, 1			# print_int(a0)
	syscall
	
	la $a0, space
	li $v0, 4			# print_str(space)
	syscall
	
	move $a0, $a2
	li $v0, 1			# print_int(a0)
	syscall
	
exit:
	li $v0, 10
	syscall

########################################################################
# Order3 Description:
# Given 3 numbers, order the numbers from lowest to highest.
#
# Arguments:
# $a0, $a1, $a2 = 3 positive integers, one in each register
#
# Returns:
# $a0 = lowest number
# $a1 = middle (median) number
# $a2 = highest number
########################################################################
order3:	
	bgt	$a0, $a1, exchange1
	bgt	$a1, $a2, exchange2
	b	next
exchange1:	
	xor	$a0, $a0, $a1	#a = a ^= b
	xor	$a1, $a1, $a0	#b = b ^= a
	xor	$a0, $a0, $a1	#a = a ^= b
	b	order3
exchange2:	
	xor	$a1, $a1, $a2	#b = b ^= c
	xor	$a2, $a2, $a1	#c = c ^= b
	xor	$a1, $a1, $a2	#b = b ^= c
	b	order3
next:		
	jr	$ra