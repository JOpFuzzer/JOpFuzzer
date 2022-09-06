#!/bin/bash
set -u
R=$1


rm -f *.java Fuzzer* *.out
ruby -I$R/rb $R/rb/Fuzzer.rb -f $R/rb/config.yml > Test.java
cp ../FuzzerUtils.class .
javac -J-Xmx512m -J-XX:ActiveProcessorCount=1 --release 8 Test.java

