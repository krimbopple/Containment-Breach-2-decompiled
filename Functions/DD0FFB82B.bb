Function DD0FFB82B%(arg0.materials)
    Local local0%
    If (arg0\Field13 <> 0) Then
        Return $00
    EndIf
    For local0 = $01 To $05 Step $01
        X4F8FDFX04(arg0, local0)
    Next
    arg0\Field13 = $01
    Return $00
End Function
