Function initsubtitlesassets%()
    subassets = (New subtitlesassets)
    subassets\Field4 = ((Float opt\Field21) * 0.75)
    subassets\Field2 = ((Float (TDD0Z6BXB6\Field6 + $01)) - (subassets\Field4 / 2.0))
    subassets\Field3 = ((Float opt\Field46) * 0.82)
    setfontex(XD00026ZX2\Field0[$00])
    subassets\Field5 = (Int ((Float fontheight()) * 2.5))
    Return $00
End Function
