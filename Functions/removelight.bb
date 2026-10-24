Function removelight%(arg0.lights)
    freeentity(arg0\Field7)
    arg0\Field7 = $00
    Delete arg0
    Return $00
End Function
