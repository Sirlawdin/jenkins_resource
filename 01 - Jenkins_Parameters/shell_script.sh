#!/bin/bash

S_PARAMETER1=$1
S_PARAMETER2=$2
LOGIC=$3

if [ "$LOGIC" = "true" ]; then
  echo "Welcome to $S_PARAMETER1 $S_PARAMETER2"
else
  echo "Please mark the show option to get an output"
fi
