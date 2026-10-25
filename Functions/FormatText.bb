Function FormatText%(arg0#, arg1#, arg2$, arg3%, arg4%, arg5#, arg6%, arg7#)
    Local local0%
    Local local1%
    Local local2#
    Local local3%
    Local local4$
    Local local5#
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14$
    Local local15#
    Local local16$
    Local local17%
    Local local18%
    Local local19%
    Local local20$
    local0 = len(arg2)
    local1 = local0
    If (local0 = $00) Then
        Return $00
    EndIf
    If (arg3 <> 0) Then
        arg0 = (arg0 - ((Float stringwidth(replace(arg2, chr($03), "X"))) / 2.0))
    EndIf
    If (arg4 <> 0) Then
        arg1 = (arg1 - ((Float fontheight()) / 2.0))
    EndIf
    If (local1 > $01) Then
        batching($01)
    EndIf
    local2 = ((Float fontheight()) * 1.2)
    local3 = $00
    local4 = ""
    local5 = arg0
    For local6 = $01 To local0 Step $01
        While (((T6Z20B84Z6 <> Null) And (T6Z20B84Z6\Field2 = X2BD664FD2)) <> 0)
            If (local4 <> "") Then
                local7 = stringwidth(local4)
                local8 = stringheight(local4)
                local9 = mouseon((Int local5), (Int arg1), local7, (Int local2))
                If (local9 <> 0) Then
                    local3 = $01
                EndIf
                local10 = colorred()
                local11 = colorgreen()
                local12 = colorblue()
                local13 = coloralpha()
                If (((TZ4B08Z4BZ <> Null) And (TZ4B08Z4BZ\Field3 = $03)) <> 0) Then
                    If (local9 <> 0) Then
                        TXDBD82D24F = TZ4B08Z4BZ\Field4
                        GUESSEDcallclamp_2($02)
                    EndIf
                    If (0.0 < arg7) Then
                        color($32, $32, $32, local13)
                        textex((Int (local5 + arg7)), (Int (arg1 + arg7)), local4, $00, $00)
                        color(local10, local11, local12, local13)
                    EndIf
                    If (TZ4B08Z4BZ\Field4 = TXDBD82D24F) Then
                        color((Int ((Float local10) * 0.7)), (Int ((Float local11) * 0.7)), (Int ((Float local12) * 0.7)), (Int ((Float local13) * arg5)))
                        If (TDD0Z6BXB6\Field7 <> 0) Then
                            local14 = _SplitString(TZ4B08Z4BZ\Field0, ",", $00)
                            If (((local14 <> "") And GUESSEDruncmd(local14)) <> 0) Then
                                If (TX84DF6X6B6\Field5 <> 0) Then
                                    GUESSEDcheckvalue($00)
                                EndIf
                                GUESSEDsetglobal_19(local14)
                                GUESSEDresetresetinput(getlocalstring("mpmenu", "moveurl"), ("&hyperlink[,1]" + local14), getlocalstring("gui", "yes"), getlocalstring("gui", "no"), $00, FuncPtr(XF4ZZ4DF6X), $01, $00)
                            EndIf
                            TDD0Z6BXB6\Field7 = $00
                        EndIf
                    EndIf
                    textex((Int local5), (Int arg1), local4, $00, $00)
                    If ((Int trim(_SplitString(TZ4B08Z4BZ\Field0, ",", $01))) = $01) Then
                        rect((Int local5), (Int ((arg1 + (Float local8)) - 1.0)), local7, $01, $01)
                    EndIf
                    color(local10, local11, local12, local13)
                Else
                    If (0.0 < arg7) Then
                        color($32, $32, $32, local13)
                        textex((Int (local5 + arg7)), (Int (arg1 + arg7)), local4, $00, $00)
                        color(local10, local11, local12, local13)
                    EndIf
                    textex((Int local5), (Int arg1), local4, $00, $00)
                EndIf
                local5 = (local5 + (Float local7))
                local4 = ""
            EndIf
            local15 = (Float GUESSEDdrawsplit(T6Z20B84Z6, (Int local5), (Int arg1), arg5))
            local5 = (local5 + local15)
            TZ4B08Z4BZ = T6Z20B84Z6
            T6Z20B84Z6 = (After T6Z20B84Z6)
        Wend
        local16 = GUESSEDcheckvalue_24(arg2, local6)
        If (local16 <> "") Then
            local4 = (local4 + local16)
        EndIf
        GUESSEDaddglobalvalue($01)
        If (((arg6 > $00) And (local6 >= arg6)) <> 0) Then
            If (local6 < local0) Then
                local4 = (local4 + "...")
            EndIf
            Exit
        EndIf
    Next
    If (local4 <> "") Then
        local17 = stringwidth(local4)
        local18 = stringheight(local4)
        local19 = mouseon((Int local5), (Int arg1), local17, (Int local2))
        If (local19 <> 0) Then
            local3 = $01
        EndIf
        local10 = colorred()
        local11 = colorgreen()
        local12 = colorblue()
        local13 = coloralpha()
        If (((TZ4B08Z4BZ <> Null) And (TZ4B08Z4BZ\Field3 = $03)) <> 0) Then
            If (local19 <> 0) Then
                TXDBD82D24F = TZ4B08Z4BZ\Field4
                GUESSEDcallclamp_2($02)
            EndIf
            If (0.0 < arg7) Then
                color($32, $32, $32, local13)
                textex((Int (local5 + arg7)), (Int (arg1 + arg7)), local4, $00, $00)
                color(local10, local11, local12, local13)
            EndIf
            If (TZ4B08Z4BZ\Field4 = TXDBD82D24F) Then
                color((Int ((Float local10) * 0.7)), (Int ((Float local11) * 0.7)), (Int ((Float local12) * 0.7)), (Int ((Float local13) * arg5)))
                If (TDD0Z6BXB6\Field7 <> 0) Then
                    local20 = _SplitString(TZ4B08Z4BZ\Field0, ",", $00)
                    If (((local20 <> "") And GUESSEDruncmd(local20)) <> 0) Then
                        If (TX84DF6X6B6\Field5 <> 0) Then
                            GUESSEDcheckvalue($00)
                        EndIf
                        GUESSEDsetglobal_19(local20)
                        GUESSEDresetresetinput(getlocalstring("mpmenu", "moveurl"), ("&hyperlink[,1]" + local20), getlocalstring("gui", "yes"), getlocalstring("gui", "no"), $00, FuncPtr(XF4ZZ4DF6X), $01, $00)
                    EndIf
                    TDD0Z6BXB6\Field7 = $00
                EndIf
            EndIf
            textex((Int local5), (Int arg1), local4, $00, $00)
            If ((Int trim(_SplitString(TZ4B08Z4BZ\Field0, ",", $01))) = $01) Then
                rect((Int local5), (Int ((arg1 + (Float local18)) - 1.0)), local17, $01, $01)
            EndIf
            color(local10, local11, local12, local13)
        Else
            If (0.0 < arg7) Then
                color($32, $32, $32, local13)
                textex((Int (local5 + arg7)), (Int (arg1 + arg7)), local4, $00, $00)
                color(local10, local11, local12, local13)
            EndIf
            textex((Int local5), (Int arg1), local4, $00, $00)
        EndIf
    EndIf
    If (local1 > $01) Then
        batching($00)
    EndIf
    Return local3
    Return $00
End Function
