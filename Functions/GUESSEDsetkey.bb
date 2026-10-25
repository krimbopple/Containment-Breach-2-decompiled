Function GUESSEDsetkey%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4.TX2BF6X0FF4
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17%
    If (((GUESSEDupdatexdb() <> $00) And ((((((TX6X48DXXDX Lor menuopen) Lor consoleopen) Lor invopen) = $00) And keydown(key\Field14)) Lor T84F6Z402D\Field5)) <> 0) Then
        If (TDD0Z6BXB6\Field1 = $00) Then
            onsliderid = $00
        EndIf
        If (TXXF6F02DB2[GUESSEDupdatedropitem()] <> Null) Then
            TXXF6F02DB2[GUESSEDupdatedropitem()]\Field27 = opt\Field75
        EndIf
        setfontex(XD00026ZX2\Field0[$00])
        local0 = (Int (700.0 * menuscale))
        local1 = (Int (80.0 * menuscale))
        local2 = (Int (35.0 * menuscale))
        local3 = $00
        For local4 = Each TX2BF6X0FF4
            local3 = (local3 + $01)
            If (local3 <= $08) Then
                local1 = ((local1 + local2) - $01)
            EndIf
        Next
        If (local3 <> T84F6Z402D\Field4) Then
            shoulddeletegadgets = $01
            T84F6Z402D\Field4 = local3
        EndIf
        local5 = (Int ((Float opt\Field21) / 2.0))
        local6 = (Int (((Float opt\Field46) / 2.0) + (15.0 * menuscale)))
        local7 = (Int ((Float local0) * 0.05))
        local8 = (Int ((Float local0) * 0.05))
        local9 = (Int ((Float local0) * 0.07))
        local10 = (local5 - (local0 Sar $01))
        local11 = ((local10 + local0) - local7)
        local12 = ((local11 - local8) + $01)
        local13 = ((local12 - local9) + $01)
        local14 = ((local13 - local10) + $01)
        local15 = (Int ((Float local6) - ((Float local1) / 2.0)))
        updatemenubutton(local10, local15, local0, local1, "", $00, $00, $00, $FF, $FF, $FF, $00, 1.0, $01, $01)
        updatemenubutton(local10, ((Int (30.0 * menuscale)) + local15), local0, (Int (4.0 * menuscale)), "", $00, $00, $00, $FF, $FF, $FF, $00, 1.0, $01, $01)
        local16 = ((Int (30.0 * menuscale)) + local15)
        local17 = $00
        For local4 = Each TX2BF6X0FF4
            If (local4\Field38 <> Null) Then
                local17 = (local17 + $01)
                If (((local17 > (T84F6Z402D\Field1 Shl $03)) And (local17 <= ((T84F6Z402D\Field1 + $01) Shl $03))) <> 0) Then
                    local16 = MP_UpdateUserRow(local4, local16, local10, local14, local2, local13, local9, local12, local8, local11, local7, local0)
                    If (local16 = $FFFFFFFF) Then
                        Return $00
                    EndIf
                EndIf
            EndIf
        Next
        For local4 = Each TX2BF6X0FF4
            If (local4\Field38 = Null) Then
                local17 = (local17 + $01)
                If (((local17 > (T84F6Z402D\Field1 Shl $03)) And (local17 <= ((T84F6Z402D\Field1 + $01) Shl $03))) <> 0) Then
                    local16 = MP_UpdateUserRow(local4, local16, local10, local14, local2, local13, local9, local12, local8, local11, local7, local0)
                    If (local16 = $FFFFFFFF) Then
                        Return $00
                    EndIf
                EndIf
            EndIf
        Next
        If (local3 > ((T84F6Z402D\Field1 + $01) Shl $03)) Then
            If (updatemenubutton(((local0 / $03) + local5), ((local15 + local1) - (Int (45.0 * menuscale))), (Int (60.0 * menuscale)), (Int (20.0 * menuscale)), ">>>", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                T84F6Z402D\Field1 = (T84F6Z402D\Field1 + $01)
                shoulddeletegadgets = $01
            EndIf
        ElseIf (T84F6Z402D\Field1 > (local3 Sar $03)) Then
            T84F6Z402D\Field1 = (Int ((Float T84F6Z402D\Field1) - floor((Float (local3 Sar $03)))))
        EndIf
        If (T84F6Z402D\Field1 > $00) Then
            If (updatemenubutton((local5 - (local0 / $03)), ((local15 + local1) - (Int (45.0 * menuscale))), (Int (60.0 * menuscale)), (Int (20.0 * menuscale)), "<<<", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                T84F6Z402D\Field1 = (T84F6Z402D\Field1 - $01)
                shoulddeletegadgets = $01
            EndIf
        EndIf
        If (TDD0Z6BXB6\Field12 <> 0) Then
            T84F6Z402D\Field5 = $01
        EndIf
        If (T84F6Z402D\Field5 <> 0) Then
            TX6X48DXXDX = $01
            menuopen = $00
            consoleopen = $00
            invopen = $00
            If (keyhit($01) <> 0) Then
                T84F6Z402D\Field5 = $00
                TX6X48DXXDX = $00
                shoulddeletegadgets = $01
            EndIf
        EndIf
        T84F6Z402D\Field2 = $01
    Else
        If (T84F6Z402D\Field2 <> 0) Then
            shoulddeletegadgets = $01
        EndIf
        T84F6Z402D\Field2 = $00
        T84F6Z402D\Field1 = $00
        T84F6Z402D\Field0 = $00
    EndIf
    Return $00
End Function
