Function GUESSEDupdatesplit_2%(arg0%)
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4%
    Local local5#
    Local local7%
    Local local8$[32]
    Local local9%
    Local local10%
    Local local11$
    Local local12%
    Local local13#
    Local local14#
    Local local15%
    Local local16%
    Local local17$
    Local local19#
    Local local20#
    Local local21%
    If ((TX84DF6X6B6\Field5 And (menuopen = $00)) <> 0) Then
        local0 = menuscale
        menuscale = (menuscale * 0.75)
        setfontex(XD00026ZX2\Field0[arg0])
        local1 = (740.0 * menuscale)
        local2 = (160.0 * menuscale)
        local3 = (140.0 * menuscale)
        While ((((local3 * 0.9) < (Float stringwidth(GUESSEDgettask(TX84DF6X6B6\Field1)))) Lor ((local3 * 0.9) < (Float stringwidth(GUESSEDgettask(TX84DF6X6B6\Field2))))) <> 0)
            local1 = ((30.0 * menuscale) + local1)
            local3 = ((20.0 * menuscale) + local3)
        Wend
        While ((local1 * 0.9) < (Float stringwidth(GUESSEDgettask(TX84DF6X6B6\Field9))))
            local1 = ((10.0 * menuscale) + local1)
        Wend
        local5 = ((6.0 * menuscale) + (Float fontheight()))
        Select TX84DF6X6B6\Field11
            Case $00,$02
                If (TX84DF6X6B6\Field11 = $02) Then
                    local2 = (220.0 * menuscale)
                EndIf
                local7 = getlineamount(TX84DF6X6B6\Field14, (Int (local1 * 0.9)), opt\Field46, (6.0 * menuscale))
                local2 = (((Float local7) * local5) + local2)
            Case $01
                local2 = (150.0 * menuscale)
                local9 = $00
                local10 = _CountSplitString(TX84DF6X6B6\Field14, chr($0A))
                For local4 = $00 To (local10 - $01) Step $01
                    local11 = _SplitString(TX84DF6X6B6\Field14, chr($0A), local4)
                    local9 = (local9 + $01)
                    local8[local9] = local11
                    local12 = stringwidth(GUESSEDgeteax_0007(local11))
                    While ((Float local12) > (local1 * 0.9))
                        local1 = ((10.0 * menuscale) + local1)
                    Wend
                    If (local9 >= $1F) Then
                        Exit
                    EndIf
                Next
                local2 = ((((15.0 * menuscale) + (Float fontheight())) * (Float local9)) + local2)
        End Select
        local13 = (Float (opt\Field21 Sar $01))
        local14 = (Float (opt\Field46 Sar $01))
        updatemenubutton((Int (local13 - (local1 / 2.0))), (Int (local14 - (local2 / 2.0))), (Int local1), (Int local2), "", arg0, $00, $00, $FF, $FF, $FF, $00, 1.0, $01, $01)
        updatemenubutton((Int (local13 - (local1 / 2.0))), (Int ((local14 - (local2 / 2.0)) + (40.0 * menuscale))), (Int local1), (Int max((1.0 * menuscale), 1.0)), "", arg0, $00, $00, $FF, $FF, $FF, $00, 1.0, $01, $01)
        local15 = $00
        local16 = $00
        If (((TX84DF6X6B6\Field1 <> "") And (TX84DF6X6B6\Field2 <> "")) <> 0) Then
            If (updatemenubutton((Int max(((local13 - local3) - ((140.0 * menuscale) * 0.5)), (local13 - (local1 / 2.0)))), (Int (((local2 / 2.0) + local14) - (60.0 * menuscale))), (Int local3), (Int (45.0 * menuscale)), TX84DF6X6B6\Field2, arg0, $01, $00, $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                local16 = $01
                local15 = $01
            EndIf
            If (updatemenubutton((Int min((((140.0 * menuscale) * 0.5) + local13), (((local1 / 2.0) + local13) - local3))), (Int (((local2 / 2.0) + local14) - (60.0 * menuscale))), (Int local3), (Int (45.0 * menuscale)), TX84DF6X6B6\Field1, arg0, $01, $00, $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                local16 = $01
                local15 = $00
            EndIf
        Else
            local17 = ""
            If (TX84DF6X6B6\Field2 <> "") Then
                local17 = TX84DF6X6B6\Field2
            EndIf
            If (TX84DF6X6B6\Field1 <> "") Then
                local17 = TX84DF6X6B6\Field1
            EndIf
            If (updatemenubutton((Int (local13 - (local3 / 2.0))), (Int (((local2 / 2.0) + local14) - (60.0 * menuscale))), (Int local3), (Int (45.0 * menuscale)), local17, arg0, $01, $00, $FF, $FF, $FF, $00, 1.0, $00, $00) <> 0) Then
                local16 = $01
                local15 = $01
            EndIf
        EndIf
        Select TX84DF6X6B6\Field11
            Case $02
                TX84DF6X6B6\Field7 = updatemenuinputbox((Int (local13 - ((local1 * 0.8) / 2.0))), (Int (((local2 / 2.0) + local14) - (120.0 * menuscale))), (Int (local1 * 0.8)), (Int (45.0 * menuscale)), TX84DF6X6B6\Field7, arg0, $3E8, $40, 1.0, $00, $00, $00)
            Case $01
                local19 = ((15.0 * menuscale) + (Float fontheight()))
                local4 = local9
                While (local4 >= $01)
                    local20 = (((local14 - (local2 / 2.0)) + (40.0 * menuscale)) + (local19 * (Float (local4 - $01))))
                    If (updatemenubutton((Int (local13 - (local1 / 2.0))), (Int local20), (Int local1), (Int local19), local8[local4], arg0, $00, (TX84DF6X6B6\Field6 = (local4 - $01)), $FF, $FF, $FF, $00, (((Float (TX84DF6X6B6\Field18 = $00)) * 1.0) + 0.08), $00, $00) <> 0) Then
                        TX84DF6X6B6\Field6 = (local4 - $01)
                        TDD0Z6BXB6\Field0 = $00
                    EndIf
                    If ((TDD0Z6BXB6\Field0 And mouseon((Int (local13 - (local1 / 2.0))), (Int local20), (Int local1), (Int local19))) <> 0) Then
                        local16 = $01
                        local15 = $01
                    EndIf
                    local4 = (local4 + $FFFFFFFF)
                Wend
        End Select
        If (keyhit($1C) <> 0) Then
            local16 = $01
            local15 = $01
        ElseIf (keyhit($01) <> 0) Then
            local16 = $01
            local15 = $00
        EndIf
        local21 = ((TX84DF6X6B6\Field13 <> $00) And (TX84DF6X6B6\Field13 < millisecs()))
        If ((local16 Lor local21) <> 0) Then
            If ((local15 And (TX84DF6X6B6\Field6 = $FFFFFFFF)) <> 0) Then
                TX84DF6X6B6\Field6 = $00
            EndIf
            GUESSEDcheckvalue(local15)
            If (local21 = $00) Then
                playsound_strict(buttonsfx[$00], $00, $00)
                resetinput(25.0)
            EndIf
            shoulddeletegadgets = $01
        EndIf
        TX6X48DXXDX = $01
        menuscale = local0
    EndIf
    Return $00
End Function
