Function TXD6FFF8D%()
    Local local0%
    local0 = XZ0260X8X2\Field29
    XZ0260X8X2\Field29 = keydown(key\Field2)
    XZ0260X8X2\Field54 = (local0 And (XZ0260X8X2\Field29 = $00))
    XZ0260X8X2\Field3 = keyhit(key\Field2)
    If (((((((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor menuopen) Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) <> 0) Then
        XZ0260X8X2\Field29 = $00
        XZ0260X8X2\Field54 = $00
        XZ0260X8X2\Field3 = $00
    EndIf
    Return $00
End Function
