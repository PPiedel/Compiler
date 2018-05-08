#!/bin/bash
llc -filetype=obj helloWorld.ll; gcc helloWorld.o -o helloWorld; ./helloWorld