Function removesecuritycam%(arg0.securitycams)
    If (arg0\Field14 <> $00) Then
        freeentity(arg0\Field14)
        arg0\Field14 = $00
    EndIf
    freeentity(arg0\Field7)
    arg0\Field7 = $00
    freeentity(arg0\Field0)
    arg0\Field0 = $00
    If (arg0\Field12 <> 0) Then
        freeentity(arg0\Field15)
        arg0\Field15 = $00
        freeentity(arg0\Field22)
        arg0\Field22 = $00
        freeentity(arg0\Field3)
        arg0\Field3 = $00
        freeentity(arg0\Field21)
        arg0\Field21 = $00
    EndIf
    Delete arg0
    Return $00
End Function
