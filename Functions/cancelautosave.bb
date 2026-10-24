Function cancelautosave%()
    createhintmsg(getlocalstring("save", "autosave.canceled"), 6.0, $00)
    autosave\Field0 = 4200.0
    Return $00
End Function
