Function XF6284DFZD%()
    Local local0%
    Local local1#
    Local local2#
    Local local3#
    Local local4$
    Local local5$
    Local local6$
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    eax_000E = (Int ((Float (opt\Field21 - imagewidth(mma\Field4))) - (20.0 * menuscale)))
    drawimage(mma\Field4, (opt\Field46 - imageheight(mma\Field4)), $00, $00)
    local0 = $00
    local1 = 0.9
    While (0.3 <= local1)
        local2 = ((Float opt\Field21) - ((Float imagewidth(mma\Field4)) * local1))
        local3 = ((Float (opt\Field46 - imageheight(mma\Field0))) - (20.0 * menuscale))
        color($FF, $FF, $FF, $FF)
        If (mouseon((Int local2), (Int local3), imagewidth(mma\Field0), imageheight(mma\Field0)) <> 0) Then
            color($64, $64, $64, $FF)
        EndIf
        eax_005B = mma\Field0
        drawimage((Int local2), (Int local3), local0, $01)
        local0 = (local0 + $01)
        local1 = (local1 + -0.2)
    Wend
    If (TZX4482FFF <> Null) Then
        setfontex(XD00026ZX2\Field0[$00])
        local4 = XX226ZZXZB(TZX4482FFF\Field2, TZX4482FFF\Field1, TZX4482FFF\Field4)
        local5 = ("&c[255 255 255]YOUR TAG: " + local4)
        local6 = XX8XZZFFF(local5)
        local7 = (Float stringwidth(replace(local6, chr($03), "X")))
        local8 = (Float fontheight())
        local9 = (15.0 * menuscale)
        local10 = (8.0 * menuscale)
        local11 = ((local9 * 2.0) + local7)
        local12 = ((local10 * 2.0) + local8)
        local13 = (20.0 * menuscale)
        local14 = (((Float opt\Field21) - local11) - local13)
        local15 = local13
        color($05, $05, $05, $FF)
        rect((Int local14), eax_005B, (Int local11), eax_000E, $01)
        color($C8, $C8, $C8, $FF)
        rect((Int local14), (Int local15), (Int local11), (Int local12), $00)
        X44ZBBZ44X((local14 + local9), (local15 + local10), local6, $00, $00, 1.0, $00, 0.0)
    EndIf
    Return $00
End Function
