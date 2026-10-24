Function X0266866F2%(arg0%, arg1%)
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4%
    Local local5#
    Local local7%
    Local local8%
    Local local9%
    Local local10$
    Local local11%
    Local local12#
    Local local13#
    If ((TX84DF6X6B6\Field5 And (menuopen = $00)) <> 0) Then
        local0 = menuscale
        menuscale = (menuscale * 0.75)
        setfontex(XD00026ZX2\Field0[arg0])
        local1 = (740.0 * menuscale)
        local2 = (160.0 * menuscale)
        local3 = (140.0 * menuscale)
        While ((((local3 * 0.9) < (Float stringwidth(XBBFXB0Z4B(TX84DF6X6B6\Field1)))) Lor ((local3 * 0.9) < (Float stringwidth(XBBFXB0Z4B(TX84DF6X6B6\Field2))))) <> 0)
            local1 = ((30.0 * menuscale) + local1)
            local3 = ((20.0 * menuscale) + local3)
        Wend
        While ((local1 * 0.9) < (Float stringwidth(XBBFXB0Z4B(TX84DF6X6B6\Field9))))
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
                local8 = $00
                local9 = TXZ26D40ZFF(TX84DF6X6B6\Field14, chr($0A))
                For local4 = $00 To (local9 - $01) Step $01
                    local10 = T26ZD804D6(TX84DF6X6B6\Field14, chr($0A), local4)
                    local8 = (local8 + $01)
                    local11 = stringwidth(XBBFXB0Z4B(local10))
                    While ((Float local11) > (local1 * 0.9))
                        local1 = ((10.0 * menuscale) + local1)
                    Wend
                    If (local8 >= $1F) Then
                        Exit
                    EndIf
                Next
                local2 = ((((15.0 * menuscale) + (Float fontheight())) * (Float local8)) + local2)
        End Select
        If (arg1 <> 0) Then
            rendermenubuttons()
        EndIf
        local12 = (Float (opt\Field21 Sar $01))
        local13 = (Float (opt\Field46 Sar $01))
        color($FF, $FF, $FF, $FF)
        X44ZBBZ44X(local12, ((local13 - (local2 / 2.0)) + (20.0 * menuscale)), XX8XZZFFF(TX84DF6X6B6\Field9), $01, $01, 1.0, $00, 0.0)
        Select TX84DF6X6B6\Field11
            Case $00,$02
                color($FF, $FF, $FF, $FF)
                XF4086X4F8(TX84DF6X6B6\Field14, (Int (local12 - ((local1 * 0.9) / 2.0))), (Int ((local13 - (local2 / 2.0)) + (80.0 * menuscale))), (Int (local1 * 0.9)), (Int local2), TX84DF6X6B6\Field18, (6.0 * menuscale), 1.0, 0.0)
                If (TX84DF6X6B6\Field11 = $02) Then
                    rendermenuinputboxes()
                EndIf
        End Select
        menuscale = local0
    EndIf
    Return $00
End Function
