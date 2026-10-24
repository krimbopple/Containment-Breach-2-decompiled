Function Z4X448BD2%(arg0%, arg1%, arg2$, arg3%, arg4#, arg5#)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (arg3 <> 0) Then
        X44ZBBZ44X((Float arg0), (Float arg1), arg2, $00, $00, arg4, $00, arg5)
    Else
        If (0.0 < arg5) Then
            local0 = colorred()
            local1 = colorgreen()
            local2 = colorblue()
            local3 = coloralpha()
            color($32, $32, $32, local3)
            textex((Int ((Float arg0) + arg5)), (Int ((Float arg1) + arg5)), arg2, $00, $00)
            color(local0, local1, local2, local3)
        EndIf
        textex(arg0, arg1, arg2, $00, $00)
    EndIf
    Return $00
End Function
