DcMotor leftFront;

leftFront = hardwareMap.get(DcMotor.class, "leftFront");

//binds leftfront to a button 

if(gamepad1.a){
  leftFront.setPower(-1);
}

else{
  leftfront.setPower(0)
}

//bind to a joystick 

double leftFrontpower;

leftFrontpower = gamepad.right_stick_y;
 
leftFront.setPower(leftfrontpower);
