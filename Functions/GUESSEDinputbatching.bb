Function GUESSEDinputbatching%()
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7%
    Local local8#
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17%
    Local local18%
    Local local19#
    Local local20.X22ZD22448
    If ((((GUESSEDupdatexdb() = $00) And (XZB6BXFF02\Field9 > $00)) Lor (opt\Field74 = $00)) <> 0) Then
        Return $00
    EndIf
    local0 = (Float XZB6BXFF02\Field11)
    local1 = (Float XZB6BXFF02\Field9)
    setfontex(XD00026ZX2\Field0[$00])
    local2 = (opt\Field33 * menuscale)
    local3 = opt\Field66
    local4 = 0.0
    local5 = (local1 - local2)
    local6 = local1
    local8 = 1.0
    If (XZB6BXFF02\Field5 <> 0) Then
        local4 = (Float GUESSEDsetglobal_4())
        local8 = 100000.0
        If (TDD0Z6BXB6\Field1 = $00) Then
            If (XZB6BXFF02\Field6 <> 0) Then
                opt\Field4 = (Int ((Float XZB6BXFF02\Field11) / menuscale))
                opt\Field78 = (Int ((Float XZB6BXFF02\Field9) / menuscale))
                opt\Field36 = $01
                saveoptionsini($00)
                XZB6BXFF02\Field6 = $00
            EndIf
        ElseIf (XZB6BXFF02\Field6 = $01) Then
            shoulddeletegadgets = $01
            XZB6BXFF02\Field11 = (Int ((Float XZB6BXFF02\Field13) + (mouseposx - (Float XZB6BXFF02\Field12))))
            XZB6BXFF02\Field9 = (Int ((Float XZB6BXFF02\Field15) + (mouseposy - (Float XZB6BXFF02\Field3))))
            local0 = (Float XZB6BXFF02\Field11)
            local1 = (Float XZB6BXFF02\Field9)
            local5 = (local1 - local2)
            local6 = local1
        ElseIf (XZB6BXFF02\Field6 = $02) Then
            shoulddeletegadgets = $01
            opt\Field33 = (XZB6BXFF02\Field0 - ((mouseposy - (Float XZB6BXFF02\Field3)) / menuscale))
            opt\Field33 = clamp(opt\Field33, 25.0, 768.0)
            local2 = (opt\Field33 * menuscale)
            local5 = ((Float XZB6BXFF02\Field9) - local2)
            local6 = (Float XZB6BXFF02\Field9)
            local4 = (Float GUESSEDsetglobal_4())
        ElseIf (XZB6BXFF02\Field6 = $03) Then
            shoulddeletegadgets = $01
            opt\Field66 = (XZB6BXFF02\Field4 + ((mouseposx - (Float XZB6BXFF02\Field12)) / menuscale))
            opt\Field66 = clamp(opt\Field66, 200.0, 1200.0)
            local3 = opt\Field66
            local4 = (Float GUESSEDsetglobal_4())
        ElseIf (XZB6BXFF02\Field6 = $04) Then
            shoulddeletegadgets = $01
            opt\Field33 = (XZB6BXFF02\Field0 - ((mouseposy - (Float XZB6BXFF02\Field3)) / menuscale))
            opt\Field33 = clamp(opt\Field33, 25.0, 768.0)
            opt\Field66 = (XZB6BXFF02\Field4 + ((mouseposx - (Float XZB6BXFF02\Field12)) / menuscale))
            opt\Field66 = clamp(opt\Field66, 200.0, 1200.0)
            local2 = (opt\Field33 * menuscale)
            local3 = opt\Field66
            local5 = ((Float XZB6BXFF02\Field9) - local2)
            local6 = (Float XZB6BXFF02\Field9)
            local4 = (Float GUESSEDsetglobal_4())
        EndIf
        local13 = (Int (10.0 * menuscale))
        local14 = (Int (30.0 * menuscale))
        local15 = XZB6BXFF02\Field11
        XZB6BXFF02\Field11 = (Int clamp((Float XZB6BXFF02\Field11), 0.0, max(0.0, ((Float opt\Field21) - (local3 * menuscale)))))
        local0 = (Float XZB6BXFF02\Field11)
        local16 = (Int ((Float local13) + local2))
        local17 = ((opt\Field46 - local13) - local14)
        If (local16 > local17) Then
            local16 = local17
        EndIf
        local18 = XZB6BXFF02\Field9
        XZB6BXFF02\Field9 = (Int clamp((Float XZB6BXFF02\Field9), (Float local16), (Float local17)))
        If (((XZB6BXFF02\Field11 <> local15) Lor (XZB6BXFF02\Field9 <> local18)) <> 0) Then
            shoulddeletegadgets = $01
        EndIf
        local1 = (Float XZB6BXFF02\Field9)
        local5 = (local1 - local2)
        local6 = local1
        local19 = min((local2 / local4), 1.0)
        XZB6BXFF02\Field14 = (XZB6BXFF02\Field14 + ((25.0 * menuscale) * (Float mousezspeed())))
        If (mouseon((Int (((local3 * menuscale) + local0) - (15.0 * menuscale))), (Int (((local6 - (XZB6BXFF02\Field14 * local19)) - (local2 * local19)) + (15.0 * menuscale))), (Int (15.0 * menuscale)), (Int ((local2 * local19) - (14.0 * menuscale)))) <> 0) Then
            If (((TDD0Z6BXB6\Field1 And (XZB6BXFF02\Field2 = $00)) And (XZB6BXFF02\Field6 = $00)) <> 0) Then
                XZB6BXFF02\Field2 = $01
                XZB6BXFF02\Field1 = (Int mouseposy)
            EndIf
        EndIf
        If (TDD0Z6BXB6\Field1 = $00) Then
            XZB6BXFF02\Field2 = $00
        ElseIf (XZB6BXFF02\Field2 <> 0) Then
            XZB6BXFF02\Field14 = (XZB6BXFF02\Field14 - ((mouseposy - (Float XZB6BXFF02\Field1)) / local19))
            XZB6BXFF02\Field1 = (Int mouseposy)
        EndIf
        XZB6BXFF02\Field14 = clamp(XZB6BXFF02\Field14, 0.0, max((local4 - local2), 0.0))
        local9 = mouseon((Int local0), (Int ((15.0 * menuscale) + local5)), (Int ((local3 * menuscale) - (16.0 * menuscale))), (Int (20.0 * menuscale)))
        If (((local9 And (XZB6BXFF02\Field6 = $00)) And (XZB6BXFF02\Field2 = $00)) <> 0) Then
            color($96, $96, $96, $C8)
            If (TDD0Z6BXB6\Field1 <> 0) Then
                shoulddeletegadgets = $01
                XZB6BXFF02\Field6 = $01
                XZB6BXFF02\Field12 = (Int mouseposx)
                XZB6BXFF02\Field3 = (Int mouseposy)
                XZB6BXFF02\Field13 = XZB6BXFF02\Field11
                XZB6BXFF02\Field15 = XZB6BXFF02\Field9
                XZB6BXFF02\Field10 = $01
            EndIf
        EndIf
        local11 = mouseon((Int (((local3 * menuscale) + local0) - (10.0 * menuscale))), (Int ((15.0 * menuscale) + local5)), (Int (10.0 * menuscale)), (Int local2))
        If (((local11 And (XZB6BXFF02\Field6 = $00)) And (XZB6BXFF02\Field2 = $00)) <> 0) Then
            color($96, $96, $96, $C8)
            If (TDD0Z6BXB6\Field1 <> 0) Then
                shoulddeletegadgets = $01
                XZB6BXFF02\Field6 = $03
                XZB6BXFF02\Field12 = (Int mouseposx)
                XZB6BXFF02\Field4 = opt\Field66
            EndIf
        EndIf
        local10 = mouseon((Int local0), (Int (local6 - (10.0 * menuscale))), (Int ((local3 * menuscale) - (10.0 * menuscale))), (Int (10.0 * menuscale)))
        If (((local10 And (XZB6BXFF02\Field6 = $00)) And (XZB6BXFF02\Field2 = $00)) <> 0) Then
            color($96, $96, $96, $C8)
            If (TDD0Z6BXB6\Field1 <> 0) Then
                shoulddeletegadgets = $01
                XZB6BXFF02\Field6 = $02
                XZB6BXFF02\Field3 = (Int mouseposy)
                XZB6BXFF02\Field0 = opt\Field33
            EndIf
        EndIf
        local12 = mouseon((Int (((local3 * menuscale) + local0) - (10.0 * menuscale))), (Int (local6 - (10.0 * menuscale))), (Int (10.0 * menuscale)), (Int (10.0 * menuscale)))
        If (((local12 And (XZB6BXFF02\Field6 = $00)) And (XZB6BXFF02\Field2 = $00)) <> 0) Then
            color($96, $96, $96, $C8)
            If (TDD0Z6BXB6\Field1 <> 0) Then
                shoulddeletegadgets = $01
                XZB6BXFF02\Field6 = $04
                XZB6BXFF02\Field12 = (Int mouseposx)
                XZB6BXFF02\Field3 = (Int mouseposy)
                XZB6BXFF02\Field4 = opt\Field66
                XZB6BXFF02\Field0 = opt\Field33
            EndIf
        EndIf
        color($00, $00, $00, $80)
        rect((Int local0), (Int ((15.0 * menuscale) + local5)), (Int (local3 * menuscale)), (Int local2), $01)
        color($C8, $C8, $C8, $9E)
        rect((Int (((local3 - 15.0) * menuscale) + local0)), (Int (((local6 - (XZB6BXFF02\Field14 * local19)) - (local2 * local19)) + (15.0 * menuscale))), (Int (15.0 * menuscale)), (Int ((local2 * local19) - (14.0 * menuscale))), $01)
    EndIf
    If (XZB6BXFF02\Field7 > $00) Then
        scissorrect($01, (Int local0), (Int ((15.0 * menuscale) + local5)), (Int ((local3 - 30.0) * menuscale)), (Int local2))
        local20 = (Last X22ZD22448)
        batching($01)
        While (local20 <> Null)
            If (((((local5 - (80.0 * menuscale)) <= local20\Field3) And (local6 >= local20\Field3)) And (0.0 < local20\Field1)) <> 0) Then
                local1 = local20\Field3
                color($FF, $FF, $FF, (Int min((local20\Field1 * local8), 255.0)))
                GUESSEDdrawbatchedtext(local20\Field2, (Int ((10.0 * menuscale) + local0)), (Int local1), (Int (((local3 - 70.0) * menuscale) + (4.0 * menuscale))), opt\Field46, (Int (25.0 * menuscale)), local20\Field0, (min((local20\Field1 * local8), 255.0) / 255.0), (1.0 * menuscale))
            EndIf
            local20 = (Before local20)
        Wend
        batching($00)
        scissorrect($00, $00, $00, $00, $00)
    EndIf
    If (XZB6BXFF02\Field5 <> 0) Then
        If ((local9 Lor (XZB6BXFF02\Field6 = $01)) <> 0) Then
            color($FF, $FF, $FF, $FF)
            rect((Int ((((local3 * menuscale) / 2.0) + local0) - (25.0 * menuscale))), (Int ((15.0 * menuscale) + local5)), (Int (40.0 * menuscale)), (Int (7.0 * menuscale)), $01)
        EndIf
        If ((local10 Lor (XZB6BXFF02\Field6 = $02)) <> 0) Then
            color($FF, $FF, $FF, $FF)
            rect((Int ((((local3 * menuscale) / 2.0) + local0) - (25.0 * menuscale))), (Int (local6 - (7.0 * menuscale))), (Int (40.0 * menuscale)), (Int (7.0 * menuscale)), $01)
        EndIf
        If ((local11 Lor (XZB6BXFF02\Field6 = $03)) <> 0) Then
            color($FF, $FF, $FF, $FF)
            rect((Int (((local3 * menuscale) + local0) - (5.0 * menuscale))), (Int ((((15.0 * menuscale) + local5) + (local2 / 2.0)) - (10.0 * menuscale))), (Int (5.0 * menuscale)), (Int (20.0 * menuscale)), $01)
        EndIf
        If ((local12 Lor (XZB6BXFF02\Field6 = $04)) <> 0) Then
            color($FF, $FF, $FF, $FF)
            rect((Int (((local3 * menuscale) + local0) - (10.0 * menuscale))), (Int (local6 - (10.0 * menuscale))), (Int (10.0 * menuscale)), (Int (10.0 * menuscale)), $01)
        EndIf
        rendermenuinputboxes()
    EndIf
    Return $00
End Function
