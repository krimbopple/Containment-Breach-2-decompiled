Function achievementtooltip%(arg0$)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    If (((arg0 = "055") And (XZ0260X8X2\Field40 = $FFFFFFFF)) <> 0) Then
        Return $00
    EndIf
    local0 = (Int (20.0 * menuscale))
    setfontex(XD00026ZX2\Field0[$02])
    local2 = TX0Z2Z4F86D(localachievementsarray, "translations")
    local3 = TX0Z2Z4F86D(achievementsarray, "translations")
    local4 = TX0Z2Z4F86D(TX0Z2Z4F86D(local2, arg0), "name")
    If (TF46ZF6DB6(local4) <> 0) Then
        local4 = TX0Z2Z4F86D(TX0Z2Z4F86D(local3, arg0), "name")
    EndIf
    local1 = stringwidth(TX240XXB6Z6(local4))
    local5 = (Int (50.0 * menuscale))
    setfontex(XD00026ZX2\Field0[$00])
    local7 = TX0Z2Z4F86D(TX0Z2Z4F86D(local2, arg0), "description")
    If (TF46ZF6DB6(local7) <> 0) Then
        local7 = TX0Z2Z4F86D(TX0Z2Z4F86D(local3, arg0), "description")
    EndIf
    local6 = stringwidth(TX240XXB6Z6(local7))
    If (local6 > local1) Then
        local1 = local6
    EndIf
    local1 = (local1 + local0)
    local8 = (Int (mouseposx + (Float local0)))
    local9 = (Int (mouseposy + (Float local0)))
    local10 = ((local1 Sar $01) + local8)
    color($19, $19, $19, $FF)
    rect(local8, local9, local1, local5, $01)
    color($96, $96, $96, $FF)
    rect(local8, local9, local1, local5, $00)
    setfontex(XD00026ZX2\Field0[$02])
    textex(local10, (Int ((35.0 * menuscale) + mouseposy)), TX240XXB6Z6(local4), $01, $01)
    setfontex(XD00026ZX2\Field0[$00])
    textex(local10, (Int ((55.0 * menuscale) + mouseposy)), TX240XXB6Z6(local7), $01, $01)
    Return $00
End Function
