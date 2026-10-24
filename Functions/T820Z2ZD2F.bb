Function T820Z2ZD2F%()
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4%
    Local local5.FF82FZXF4
    Local local6#
    If (T42DZ064FB\Field9 <> 0) Then
        Return $00
    EndIf
    local0 = (300.0 * menuscale)
    local1 = (470.0 * menuscale)
    local2 = (((Float opt\Field21) - local0) - (20.0 * menuscale))
    local3 = (286.0 * menuscale)
    local4 = $00
    For local5 = Each FF82FZXF4
        local4 = (local4 + $01)
    Next
    If (updatemenubutton((Int ((local2 + local0) - (22.0 * menuscale))), (Int ((2.0 * menuscale) + local3)), (Int (20.0 * menuscale)), (Int (20.0 * menuscale)), "X", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
        T42DZ064FB\Field9 = $01
        shoulddeletegadgets = $01
        For local5 = Each FF82FZXF4
            freeimage(local5\Field2)
            Delete local5
        Next
        Return $00
    EndIf
    If (local4 >= $04) Then
        If (T42DZ064FB\Field5 > $00) Then
            If (updatemenubutton((Int ((2.0 * menuscale) + local2)), (Int ((local3 + local1) - (22.0 * menuscale))), (Int (40.0 * menuscale)), (Int (20.0 * menuscale)), "<<", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                T42DZ064FB\Field5 = (T42DZ064FB\Field5 - $01)
                shoulddeletegadgets = $01
            EndIf
        EndIf
        If (((T42DZ064FB\Field5 + $01) Shl $02) < local4) Then
            If (updatemenubutton((Int ((local2 + local0) - (42.0 * menuscale))), (Int ((local3 + local1) - (22.0 * menuscale))), (Int (40.0 * menuscale)), (Int (20.0 * menuscale)), ">>", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                T42DZ064FB\Field5 = (T42DZ064FB\Field5 + $01)
                shoulddeletegadgets = $01
            EndIf
        EndIf
    EndIf
    local4 = $00
    local6 = ((45.0 * menuscale) + local3)
    For local5 = Each FF82FZXF4
        If (((local4 >= (T42DZ064FB\Field5 Shl $02)) And (local4 < ((T42DZ064FB\Field5 Shl $02) + $04))) <> 0) Then
            If ((((local5\Field0 <> "") And mouseon((Int ((15.0 * menuscale) + local2)), (Int local6), imagewidth(local5\Field2), imageheight(local5\Field2))) And TDD0Z6BXB6\Field7) <> 0) Then
                execfile(local5\Field0)
            EndIf
            local6 = (((Float imageheight(local5\Field2)) + local6) + (15.0 * menuscale))
        EndIf
        local4 = (local4 + $01)
    Next
    Return $00
End Function
