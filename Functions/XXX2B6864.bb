Function XXX2B6864%(arg0.screens)
    Select arg0\Field7
        Case $01,$03
            arg0\Field8 = loadanimtexture_strict(arg0\Field6, $01, $400, $300, $00, $02, $01)
        Case $02
            arg0\Field8 = loadanimtexture_strict(arg0\Field6, $01, $400, $300, $00, $06, $01)
        Case $04
            arg0\Field8 = loadanimtexture_strict(arg0\Field6, $01, $400, $300, $00, $05, $01)
        Default
            arg0\Field8 = loadtexture_strict(arg0\Field6, $01, $01, 1.0)
    End Select
    entitytexture(arg0\Field10, arg0\Field8, $00, $00)
    X8F80Z2886(arg0\Field10, $FFFFFFFF, $00)
    Return $00
End Function
