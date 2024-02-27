#!/bin/bash
echo "Start BUILD"
ls -la $USERPATH
aws ec2 describe-instances --region $AWS_REGIONS
cat $UPLOADFILE
echo "Welcome $USERNAME"
echo "Are you sure your password is: $USERPASSWORD"
echo "Finish BUILD"