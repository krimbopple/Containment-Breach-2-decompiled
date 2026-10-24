Function X64Z0X8D64%()
    resetloadingtextcolor()
    resetinput(10.0)
    resettimingaccumulator()
    setfontex(XD00026ZX2\Field0[$00])
    deletemenugadgets()
    If (loadingimage <> $00) Then
        freeimage(loadingimage)
        loadingimage = $00
    EndIf
    If (loadingback <> $00) Then
        freeimage(loadingback)
        loadingback = $00
    EndIf
    If (EF28D22B2 <> $00) Then
        freeimage(EF28D22B2)
        EF28D22B2 = $00
    EndIf
    loadingbackwidth = $00
    loadingbackheight = $00
    selectedloadingscreens = $00
    descriptions = $00
    descriptionindex = $00
    imagealignx = ""
    imagealigny = ""
    T8ZB864XB0 = 0.0
    X4Z088FBZ0 = ""
    E2F4Z648F = $00
    TX4F8F428F = 0.0
    Return $00
End Function
