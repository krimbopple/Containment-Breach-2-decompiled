Function GUESSEDloadfont.D6BZZF0B6(arg0$, arg1$, arg2#, arg3#)
    Local local0%
    Local local1.D6BZZF0B6
    If (GUESSEDisfileinlang(arg1) = $00) Then
        GUESSEDsetred(("Unable to load sprite font: " + arg1))
        Return Null
    EndIf
    local0 = loadfont_strict(arg1, (Int arg2), $00)
    If (local0 = $00) Then
        Return Null
    EndIf
    local1 = (New D6BZZF0B6)
    local1\Field2 = arg0
    local1\Field1 = local0
    local1\Field0 = arg3
    local1\Field3 = max(arg2, 1.0)
    Return local1
    Return Null
End Function
