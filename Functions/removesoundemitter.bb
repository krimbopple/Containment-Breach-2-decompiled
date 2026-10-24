Function removesoundemitter%(arg0.soundemitters)
    freeentity(arg0\Field3)
    arg0\Field3 = $00
    Delete arg0
    Return $00
End Function
