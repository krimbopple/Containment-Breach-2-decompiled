Function canuseitem%(arg0%, arg1%, arg2%)
    If (((arg1 = $00) And ((T8660BZ460\Field3 > $00) Lor (i_1499\Field8 > $00))) <> 0) Then
        createmsg(getlocalstring("msg", "mask.use"), 6.0)
        selecteditem = Null
        Return $00
    ElseIf (((arg0 = $00) And ((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00))) <> 0) Then
        createmsg(getlocalstring("msg", "gear.use"), 6.0)
        selecteditem = Null
        Return $00
    ElseIf (((arg2 = $00) And (T8660BZ460\Field10 > $00)) <> 0) Then
        createmsg(getlocalstring("msg", "suit.use"), 6.0)
        selecteditem = Null
        Return $00
    EndIf
    Return $01
    Return $00
End Function
