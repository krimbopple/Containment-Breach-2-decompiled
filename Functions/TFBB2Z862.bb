Function TFBB2Z862%(arg0.TX2BF6X0FF4, arg1%, arg2%, arg3%, arg4%, arg5%, arg6%, arg7%, arg8%, arg9%, arg10%, arg11%)
    Local local0$
    Local local1$
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8.menuslidebar
    Local local9.menuslidebar
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    local0 = "A"
    If ((TX8F46XZ2ZZ(arg0) Lor (0.0 = arg0\Field10\Field4)) <> 0) Then
        local0 = "L"
    EndIf
    local1 = ""
    If (arg0\Field32 <> $00) Then
        TX22F0XDDZ(arg0\Field32, local2, local3, local4, local5)
        local1 = (((((((("&c[" + (Str local2)) + " ") + (Str local3)) + " ") + (Str local4)) + " ") + (Str local5)) + "]")
    EndIf
    If ((updatemenubutton(arg2, arg1, arg3, arg4, ((((local1 + "[") + (Str arg0\Field13)) + "] ") + arg0\Field27), $00, $00, (T84F6Z402D\Field0 = arg0\Field13), $FF, $FF, $FF, $00, 0.12, $01, $00) And T84F6Z402D\Field5) <> 0) Then
        T84F6Z402D\Field0 = arg0\Field13
        TDD0Z6BXB6\Field0 = $00
    EndIf
    If (((TDD0Z6BXB6\Field0 And mouseon(arg2, arg1, arg3, arg4)) And T84F6Z402D\Field5) <> 0) Then
        TX82Z28X8B6(arg0\Field13)
        resetinput(25.0)
        TDD0Z6BXB6\Field0 = $00
        T84F6Z402D\Field5 = $00
    EndIf
    updatemenubutton(arg5, arg1, arg6, arg4, (Str (Int max((Float arg0\Field47), 3.0))), $00, $00, $00, $FF, $FF, $FF, $00, 1.0, $01, $01)
    If (updatemenubutton(arg7, arg1, arg8, arg4, "W", $09, $00, (T84F6Z402D\Field3 > T2FFB8B2F0()), $FF, $FF, $FF, $00, 1.0, $00, (T84F6Z402D\Field3 > T2FFB8B2F0())) <> 0) Then
        shoulddeletegadgets = $01
        T84F6Z402D\Field5 = $00
        T84F6Z402D\Field2 = $00
        T84F6Z402D\Field1 = $00
        T84F6Z402D\Field0 = $00
        TX6X48DXXDX = $01
        X4F006266F(arg0)
        Return $FFFFFFFF
    EndIf
    If (updatemenubutton(arg9, arg1, arg10, arg4, local0, $09, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
        XBF82F4F48(arg0, $FFFFFFFF)
    EndIf
    local6 = ((arg9 + arg10) - $01)
    local7 = (Int ((Float arg11) * 0.25))
    local8 = Null
    For local9 = Each menuslidebar
        If (local9\Field1 = (arg0\Field13 + $1643)) Then
            local8 = local9
            Exit
        EndIf
    Next
    local10 = mouseon(arg9, arg1, arg10, arg4)
    If (local8 <> Null) Then
        local10 = (local10 Lor mouseon(arg9, arg1, (arg10 + local7), arg4))
    EndIf
    If (local10 <> 0) Then
        arg0\Field10\Field4 = (updatemenuslidebar(((Int (10.0 * menuscale)) + local6), (((arg4 Sar $01) + arg1) - (Int (10.0 * menuscale))), (Int ((Float arg11) * 0.2)), (arg0\Field10\Field4 * 100.0), (arg0\Field13 + $1643), $00) / 100.0)
    EndIf
    If (((local8 <> Null) And (local10 = $00)) <> 0) Then
        shoulddeletegadgets = $01
    EndIf
    If (TXXF6F02DB2[T84F6Z402D\Field0] = Null) Then
        T84F6Z402D\Field0 = $00
    EndIf
    local11 = Z000F6D6()
    If (len(arg0\Field21\Field3) > $00) Then
        If (((arg0\Field21\Field1 = $00) And (XFX80Z08ZD(arg0\Field21\Field3, $00) = $00)) <> 0) Then
            local12 = X2X4ZF6004(arg0\Field21\Field3)
            If (local12 <> $00) Then
                arg0\Field21\Field1 = T6Z46FD8D2(local12)
                If (arg0\Field21\Field1 <> $00) Then
                    arg0\Field21\Field1 = scaleimageex(arg0\Field21\Field1, (menuscale * 0.6), (menuscale * 0.6), $01)
                EndIf
            EndIf
        ElseIf (arg0\Field21\Field1 <> $00) Then
            local11 = arg0\Field21\Field1
        EndIf
    EndIf
    local13 = (((arg4 Sar $01) + arg1) - (Int ((Float imageheight(local11)) / 2.0)))
    If ((mouseon((((Int (10.0 * menuscale)) + arg2) - $01), (local13 - $01), (imagewidth(local11) + $02), (imageheight(local11) + $02)) And TDD0Z6BXB6\Field7) <> 0) Then
        TBX6X864ZX("steamid", arg0\Field21\Field3)
        playsound_strict(buttonsfx[$00], $00, $00)
    EndIf
    Return ((arg1 + arg4) - $01)
    Return $00
End Function
