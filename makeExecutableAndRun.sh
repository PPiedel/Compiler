#!/bin/bash
llc -filetype=obj code.ll; gcc code.o -o code; ./code