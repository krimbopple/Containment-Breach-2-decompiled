Function X400F44F02%(arg0.TX2BF6X0FF4)
    Local local0%
    FF6XD84B4(arg0, $FFFFFFFF, $01)
    If (arg0\Field55\Field7 = $00) Then
        Return $00
    EndIf
    For local0 = $00 To $09 Step $01
        XZZFX6D028(arg0, local0, $01)
    Next
    If (arg0\Field55\Field20 <> $00) Then
        freeentity(arg0\Field55\Field20)
        arg0\Field55\Field20 = $00
    EndIf
    freeentity(arg0\Field55\Field7)
    arg0\Field55\Field7 = $00
    hideentity(arg0\Field52)
    hideentity(arg0\Field31)
    arg0\Field55\Field7 = $00
    arg0\Field55\Field10 = $00
    arg0\Field55\Field13 = $00
    Return $01
    Return $00
End Function
