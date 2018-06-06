target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

define i32 @myFun() #0 {

	ret i32 0
}

define i32 @main() #0 {

	%name = alloca float, align 4
	store float 5.500000, float* %name, align 4

	%1 = load float, float* %name, align 4
	%2 = fpext float %1 to double
	%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.2, i32 0, i32 0), double %2)

	%x = alloca i32, align 4
	store i32 999, i32* %x, align 4

	%4 = load i32, i32* %x, align 4
	%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %4)

	%6 = alloca i32, align 4
	%glob = alloca [25 x i8], align 1
	store i32 0, i32* %6, align 4
	%7 = bitcast [25 x i8]* %glob to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %7, i8* getelementptr inbounds ([25 x i8], [25 x i8]* @main.glob, i32 0, i32 0), i64 25, i32 1, i1 false)

	%8 = getelementptr inbounds [25 x i8], [25 x i8]* %glob, i32 0, i32 0
	%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %8
)
	%10 = load i32, i32* @myFun.GLOBAL, align 4
	%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %10)

	%12 = alloca i32, align 4
	%hello = alloca [40 x i8], align 1
	store i32 0, i32* %12, align 4
	%13 = bitcast [40 x i8]* %hello to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %13, i8* getelementptr inbounds ([40 x i8], [40 x i8]* @main.hello, i32 0, i32 0), i64 40, i32 1, i1 false)

	%14 = getelementptr inbounds [40 x i8], [40 x i8]* %hello, i32 0, i32 0
	%15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %14
)
	%i = alloca i32, align 4
	store i32 0, i32* %i, align 4

	%16 = alloca i32, align 4
	%write = alloca [23 x i8], align 1
	store i32 0, i32* %16, align 4
	%17 = bitcast [23 x i8]* %write to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %17, i8* getelementptr inbounds ([23 x i8], [23 x i8]* @main.write, i32 0, i32 0), i64 23, i32 1, i1 false)

	%18 = getelementptr inbounds [23 x i8], [23 x i8]* %write, i32 0, i32 0
	%19 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %18
)
	%20 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.read, i32 0, i32 0), i32* %i)

	%21 = alloca i32, align 4
	%you = alloca [25 x i8], align 1
	store i32 0, i32* %21, align 4
	%22 = bitcast [25 x i8]* %you to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %22, i8* getelementptr inbounds ([25 x i8], [25 x i8]* @main.you, i32 0, i32 0), i64 25, i32 1, i1 false)

	%23 = getelementptr inbounds [25 x i8], [25 x i8]* %you, i32 0, i32 0
	%24 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %23
)
	%25 = load i32, i32* %i, align 4
	%26 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %25)

	%27 = alloca i32, align 4
	%add = alloca [23 x i8], align 1
	store i32 0, i32* %27, align 4
	%28 = bitcast [23 x i8]* %add to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %28, i8* getelementptr inbounds ([23 x i8], [23 x i8]* @main.add, i32 0, i32 0), i64 23, i32 1, i1 false)

	%29 = getelementptr inbounds [23 x i8], [23 x i8]* %add, i32 0, i32 0
	%30 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %29
)
	%ten = alloca i32, align 4
	store i32 10, i32* %ten, align 4

	%resultAdd = alloca i32, align 4
	store i32 0, i32* %resultAdd, align 4

	%31 = load i32, i32* %i, align 4
	%32 = load i32, i32* %ten, align 4
	%33 = add nsw i32 %31, %32
	store i32 %33, i32* %resultAdd, align 4

	%34 = load i32, i32* %resultAdd, align 4
	%35 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %34)

	%36 = alloca i32, align 4
	%mul = alloca [23 x i8], align 1
	store i32 0, i32* %36, align 4
	%37 = bitcast [23 x i8]* %mul to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %37, i8* getelementptr inbounds ([23 x i8], [23 x i8]* @main.mul, i32 0, i32 0), i64 23, i32 1, i1 false)

	%38 = getelementptr inbounds [23 x i8], [23 x i8]* %mul, i32 0, i32 0
	%39 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %38
)
	%resultMul = alloca i32, align 4
	store i32 0, i32* %resultMul, align 4

	%40 = load i32, i32* %i, align 4
	%41 = load i32, i32* %ten, align 4
	%42 = mul nsw i32 %40, %41
	store i32 %42, i32* %resultMul, align 4

	%43 = load i32, i32* %resultMul, align 4
	%44 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %43)

	%45 = alloca i32, align 4
	%sub = alloca [23 x i8], align 1
	store i32 0, i32* %45, align 4
	%46 = bitcast [23 x i8]* %sub to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %46, i8* getelementptr inbounds ([23 x i8], [23 x i8]* @main.sub, i32 0, i32 0), i64 23, i32 1, i1 false)

	%47 = getelementptr inbounds [23 x i8], [23 x i8]* %sub, i32 0, i32 0
	%48 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %47
)
	%resultSub = alloca i32, align 4
	store i32 0, i32* %resultSub, align 4

	%49 = load i32, i32* %i, align 4
	%50 = load i32, i32* %ten, align 4
	%51 = sub nsw i32 %49, %50
	store i32 %51, i32* %resultSub, align 4

	%52 = load i32, i32* %resultSub, align 4
	%53 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %52)

	%54 = alloca i32, align 4
	%div = alloca [23 x i8], align 1
	store i32 0, i32* %54, align 4
	%55 = bitcast [23 x i8]* %div to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %55, i8* getelementptr inbounds ([23 x i8], [23 x i8]* @main.div, i32 0, i32 0), i64 23, i32 1, i1 false)

	%56 = getelementptr inbounds [23 x i8], [23 x i8]* %div, i32 0, i32 0
	%57 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %56
)
	%resultDiv = alloca i32, align 4
	store i32 0, i32* %resultDiv, align 4

	%58 = load i32, i32* %i, align 4
	%59 = load i32, i32* %ten, align 4
	%60 = sdiv i32 %58, %59
	store i32 %60, i32* %resultDiv, align 4

	%61 = load i32, i32* %resultDiv, align 4
	%62 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %61)

	%63 = alloca i32, align 4
	%arr = alloca [23 x i8], align 1
	store i32 0, i32* %63, align 4
	%64 = bitcast [23 x i8]* %arr to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %64, i8* getelementptr inbounds ([23 x i8], [23 x i8]* @main.arr, i32 0, i32 0), i64 23, i32 1, i1 false)

	%65 = getelementptr inbounds [23 x i8], [23 x i8]* %arr, i32 0, i32 0
	%66 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %65
)
	%67 = alloca i32, align 4
	store i32 0, i32* %67, align 4
	%array = alloca [10 x i32], align 16

	%68 = getelementptr inbounds [10 x i32], [10 x i32]* %array, i64 0, i64 5
	store i32 555, i32* %68, align 4

	%69 = getelementptr inbounds [10 x i32], [10 x i32]* %array, i64 0, i64 5
	%70 = load i32, i32* %69, align 4
	%71 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %70)

	ret i32 0
}

@myFun.GLOBAL = internal global i32 5, align 4
@main.glob = private unnamed_addr constant [25 x i8] c"GLOBAL VARIABLE PRINT : \00", align 1

@main.hello = private unnamed_addr constant [40 x i8] c"Hello, this is program written by Pawel\00", align 1

@main.write = private unnamed_addr constant [23 x i8] c"Please write a number.\00", align 1

@main.you = private unnamed_addr constant [25 x i8] c"You have just entered : \00", align 1

@main.add = private unnamed_addr constant [23 x i8] c"Your number + 10 is : \00", align 1

@main.mul = private unnamed_addr constant [23 x i8] c"Your number * 10 is : \00", align 1

@main.sub = private unnamed_addr constant [23 x i8] c"Your number - 10 is : \00", align 1

@main.div = private unnamed_addr constant [23 x i8] c"Your number / 10 is : \00", align 1

@main.arr = private unnamed_addr constant [23 x i8] c"Array demonstration : \00", align 1


define i32 @second() #0 {

	ret i32 0
}


define i32 @third() #0 {

	ret i32 0
}


@.str = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1

@.str.1 = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"%f\0A\00", align 1
@.read = private unnamed_addr constant [3 x i8] c"%d\00", align 1

declare i32 @printf(i8*, ...) #2

declare i32 @__isoc99_scanf(i8*, ...) #1

declare void @llvm.memcpy.p0i8.p0i8.i64(i8* nocapture, i8* nocapture readonly, i64, i32, i1) #1

attributes #0 = { nounwind uwtable "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { argmemonly nounwind }
attributes #2 = { "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.ident = !{!0}

!0 = !{!"clang version 3.8.0-2ubuntu4 (tags/RELEASE_380/final)"}