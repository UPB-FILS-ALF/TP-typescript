(module
	(import "io" "writeint" (func $writeint (param $int i32)))  
	(import "io" "readint" (func $readint (result i32)))  
    (func $power (param $a i32)(result i32)
        get_local $a
        get_local $a
        i32.mul
    )
	(func $start
        call $readint
		call $power
		call $writeint  
	)

	(start $start)
)