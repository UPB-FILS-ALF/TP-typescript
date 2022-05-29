(module
    (import "io" "writechar" (func $writechar (param $char i32)))
    (import "io" "readint" (func $readint (result i32)))
    (import "io" "writeint" (func $writeint (param $int i32)))
    (import "io" "readstr" (func $readstr (param $strAddr i32) (param $length i32) (result i32)))
    (import "io" "readchar" (func $readchar (result i32)))
    (memory $0 1)
    (func $read (param $addr i32)(local $var i32)
        block $endwhile
        loop $while
            call $readchar
            set_local $var
            get_local $var
            i32.const 10
            i32.eq
            br_if $endwhile
            get_local $addr
            get_local $var
            i32.store8
            get_local $addr
            i32.const 1
            i32.add
            set_local $addr
            br $while
        end $while
        end $endwhile
    )
    (func $print (param $strAddr i32)
        block $endwhile
        loop $while
            get_local $strAddr
            i32.load8_u
            i32.const 0
            i32.eq
            br_if $endwhile
            get_local $strAddr
            i32.load8_u
            call $writechar
            get_local $strAddr
            i32.const 1
            i32.add
            set_local $strAddr
            br $while
        end $while
        end $endwhile
    )
    (func $start (local $addr i32)
        i32.const 0
        set_local $addr
        get_local $addr
        call $read  
        get_local $addr      
        call $print
        i32.const 10
        call $writechar 
    )

    (start $start)

)