########################################################################
# Description:
# Loops 4 times, adding 20 to a total variable set to 40, if the total 
# is greater than 100, subtract 100, then move the total into a 
# register and print.
#
# Arguments:
#
# Returns:
########################################################################

.text
main:
	li $s0, 40		# sum = 40
	li $t0, 0			# counter = 0
	li $t1, 4			# limit = 4
loop:
	addi $s0, $s0, 20	# sum += 20
	addi $t0, $t0, 1	# counter++
	bne $t0, $t1, loop
main2:
	li $t2, 100		# check = 100
	blt $s0, $t2, exit	# if (sum < check) { goto exit }
	sub $s0, $s0, $t2
exit:
	move $a0, $s0	# $a0 = $s0
	li $v0, 1
	syscall