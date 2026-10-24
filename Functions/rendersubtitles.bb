Function rendersubtitles%()
    Local local0.subtitlesmsg
    Local local1%
    Local local2#
    Local local3%
    Local local4#
    If (((selecteddifficulty\Field7 = difficulties[$03]\Field7) Lor (opt\Field53 = $00)) <> 0) Then
        Return $00
    EndIf
    local1 = $00
    For local0 = Each subtitlesmsg
        local1 = (local1 + $01)
    Next
    local2 = ((subassets\Field3 + (Float subassets\Field5)) - (Float (subassets\Field5 * local1)))
    local3 = (Int (5.0 * menuscale))
    local4 = (Float ((subassets\Field5 * local1) + local3))
    If (local1 = $00) Then
        local4 = (local4 - (Float local3))
    EndIf
    subassets\Field7 = curvevalue(local2, subassets\Field7, 7.0)
    subassets\Field6 = curvevalue(local4, subassets\Field6, 7.0)
    color($14, $14, $14, $BF)
    rect((Int subassets\Field2), (Int subassets\Field7), (Int subassets\Field4), (Int subassets\Field6), $01)
    local1 = $FFFFFFFF
    setfontex(XD00026ZX2\Field0[$00])
    For local0 = Each subtitlesmsg
        local1 = (local1 + $01)
        local0\Field9 = (((Float (subassets\Field5 * local1)) + local2) + (Float (local3 Shl $01)))
        local0\Field5 = curvevalue(local0\Field9, local0\Field5, 7.0)
        If (opt\Field57 <> 0) Then
            color((Int ((Float (local0\Field6 + opt\Field8)) / 2.0)), (Int ((Float (local0\Field4 + opt\Field52)) / 2.0)), (Int ((Float (local0\Field11 + opt\Field1)) / 2.0)), $FF)
        Else
            color(local0\Field6, local0\Field4, local0\Field11, $FF)
        EndIf
        textex((Int (subassets\Field2 + (10.0 * menuscale))), (Int local0\Field5), local0\Field1, $00, $00)
    Next
    color($FF, $FF, $FF, $FF)
    Return $00
End Function
