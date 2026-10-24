Function renderquickloading%()
    Local local0%
    If (((quickloadpercent > $FFFFFFFF) And opt\Field68) <> 0) Then
        local0 = (Int (90.0 * menuscale))
        midhandle(X2Z260BF0Z\Field3[$09])
        drawimage(X2Z260BF0Z\Field3[$09], (opt\Field21 - local0), $00, $00)
        color($FF, $FF, $FF, $FF)
        setfontex(XD00026ZX2\Field0[$00])
        textex((Int ((Float opt\Field21) - (100.0 * menuscale))), (opt\Field46 - local0), format(getlocalstring("loading", "loading"), (Str quickloadpercent), "%s"), $01, $00)
    EndIf
    Return $00
End Function
