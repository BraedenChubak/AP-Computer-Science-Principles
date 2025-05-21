########################################################################
# Description:
# Compute (1000 - 200 + 30), multiply by 2, and display the result
#
# Arguments:
#
# Returns:
########################################################################
.text
main:
	li $t0, 1000		# t0 = 1000
	li $t1, 200		# t1 = 200
	li $t2, 30		# t2 = 30
	sub $t3, $t0, $t1	# t3 = t0 - t1
	add $t4, $t3, $t2	# t4 = t3 + t2
	li $t5, 2			# t5 = 2 (only cause no mult by immediates)
	mul $t6, $t4, $t5	# t6 = t4 * t5
	
	move $a0, $t6		# a0 = t6
	li $v0, 1			# print_int(a0)
	syscall
	
exit:
	li $v0 10		# Return 0
	syscall