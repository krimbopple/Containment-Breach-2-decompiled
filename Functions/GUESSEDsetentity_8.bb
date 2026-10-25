Function GUESSEDsetentity_8%(arg0%, arg1%)
    If (((XF8D2FBB4Z = $00) Lor (opt\Field7 = $00)) <> 0) Then
        Return $00
    EndIf
    entitytexture(TX02ZXFF4BF, arg0, $00, $00)
    GUESSEDhideentity_7(XF8D2FBB4Z, X8DZ8X06XF, "Main", $00)
    GUESSEDhideentity_4(X8DZ8X06XF, arg1, $00, $00, $00)
    Return $01
    Return $00
End Function
