Function TBFX8B680X%(arg0%)
    AZZDXFBD6()
    Select arg0
        Case $00
        Case $01
            X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "cant_connect"), getlocalstring("mpmenu", "wrong_version"), "%s"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $02
            X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "cant_connect"), getlocalstring("mpmenu", "full"), "%s"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $04
            X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "cant_connect"), getlocalstring("mpmenu", "not_respond"), "%s"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $03
            X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "cant_connect"), getlocalstring("mpmenu", "wrong_seed"), "%s"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $05
            X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "cant_connect"), getlocalstring("mpmenu", "lobbyfail"), "%s"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $06
            X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "cant_connect"), getlocalstring("mpmenu", "steamauth"), "%s"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $07
            X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "cant_connect"), getlocalstring("mpmenu", "invalidpass"), "%s"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $09
            X88D840448(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "kicked"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $08
            X88D840448(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "banned"), getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Case $0A
            X88D840448(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "restarting"), getlocalstring("gui", "cancel"), "", $00, FuncPtr(T24FZFF022), $01, $15F90)
            If (T8X2046020\Field2 <> Null) Then
                T8X2046020\Field2\Field2 = $01
            EndIf
        Case $0B
            X88D840448(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "invalidcontent"), getlocalstring("gui", "ok"), "", $00, $00, $01, $00)
        Case $0E
            X88D840448(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "invalideffects"), getlocalstring("gui", "ok"), "", $00, $00, $01, $00)
        Case $0C
            X88D840448(getlocalstring("mpmenu", "connect2"), T64ZZ6Z68F\Field3, getlocalstring("gui", "close"), "", $00, $00, $01, $00)
        Default
            X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "cant_connect"), getlocalstring("mpmenu", "unknown"), "%s"), getlocalstring("gui", "ok"), "", $00, $00, $01, $00)
    End Select
    Return $00
End Function
