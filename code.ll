target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

define i32 @myFun() #0 {

	ret i32 0
}

define i32 @main() #0 {

	%1 = alloca i32, align 4
	%glob = alloca [25 x i8], align 1
	store i32 0, i32* %1, align 4
	%2 = bitcast [25 x i8]* %glob to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %2, i8* getelementptr inbounds ([25 x i8], [25 x i8]* @main.glob, i32 0, i32 0), i64 25, i32 1, i1 false)

	%3 = getelementptr inbounds [25 x i8], [25 x i8]* %glob, i32 0, i32 0
	%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %3
)
	%5 = load i32, i32* @myFun.GLOBAL, align 4
	%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %5)

	%7 = alloca i32, align 4
	%hello = alloca [33 x i8], align 1
	store i32 0, i32* %7, align 4
	%8 = bitcast [33 x i8]* %hello to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %8, i8* getelementptr inbounds ([33 x i8], [33 x i8]* @main.hello, i32 0, i32 0), i64 33, i32 1, i1 false)

	%9 = getelementptr inbounds [33 x i8], [33 x i8]* %hello, i32 0, i32 0
	%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %9
)
	%i = alloca i32, align 4
	store i32 0, i32* %i, align 4

	br label %11
	%12 = load i32, i32* %i, align 4
	%13 = icmp slt i32 %12, 10
	br i1 %13, label %14, label %18

	%one = alloca i32, align 4
	store i32 1, i32* %one, align 4

	%15 = load i32, i32* %i, align 4
	%16 = load i32, i32* %one, align 4
	%17 = add nsw i32 %15, %16
	store i32 %17, i32* %i, align 4

	br label %11
	%19 = alloca i32, align 4
	%printS = alloca [58 x i8], align 1
	store i32 0, i32* %19, align 4
	%20 = bitcast [58 x i8]* %printS to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %20, i8* getelementptr inbounds ([58 x i8], [58 x i8]* @main.printS, i32 0, i32 0), i64 58, i32 1, i1 false)

	%21 = getelementptr inbounds [58 x i8], [58 x i8]* %printS, i32 0, i32 0
	%22 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %21
)
	%23 = load i32, i32* %i, align 4
	%24 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %23)

	ret i32 0
}

@myFun.GLOBAL = internal global i32 5, align 4
@main.glob = private unnamed_addr constant [25 x i8] c"GLOBAL VARIABLE PRINT : \00", align 1

@main.hello = private unnamed_addr constant [33 x i8] c"Jestem w pierwszej instrukcji IF\00", align 1

@main.printS = private unnamed_addr constant [58 x i8] c"Zmienna i po dziesieciokrotnym dodaniu jedynki w petli : \00", align 1




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