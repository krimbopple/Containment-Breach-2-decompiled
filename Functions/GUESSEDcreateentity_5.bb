Function GUESSEDcreateentity_5%(arg0#, arg1#, arg2%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (((0.0 > arg0) Lor (0.0 > arg1)) <> 0) Then
        arg0 = TX8BB24F442
        arg1 = TXF0FBX4F06
    Else
        arg0 = max(arg0, 0.1)
        arg1 = max(arg1, 0.1)
    EndIf
    local0 = ((arg0 <> TX8BB24F442) Lor (arg1 <> TXF0FBX4F06))
    local1 = ((T22FB2Z0B2 <> $00) And ((textureflags(T22FB2Z0B2) And $1000) <> $00))
    If (local1 <> arg2) Then
        local0 = $01
    EndIf
    If (local0 <> 0) Then
        TX8BB24F442 = arg0
        TXF0FBX4F06 = arg1
        If (T22FB2Z0B2 <> $00) Then
            freetexture(T22FB2Z0B2)
            freetexture(TXZDB46B02X)
            freetexture(T20Z2020X22)
            freetexture(TDB84FBX46)
            freetexture(X2BFB86264)
            freetexture(XFB40886X8)
            freetexture(X8DZ8X06XF)
            freeentity(TX228822BX8)
            freeentity(XBFB62Z0F0)
            freeentity(TX6D2F2B600)
            freeentity(T204DXXFX02)
        EndIf
        If (T6X8280DX8 <> $00) Then
            freetexture(T6X8280DX8)
            T6X8280DX8 = $00
        EndIf
        local2 = (Int ((Float graphicswidth()) * TX8BB24F442))
        local3 = (Int ((Float graphicsheight()) * TXF0FBX4F06))
        If (arg2 <> 0) Then
            T22FB2Z0B2 = createtexture(local2, local3, $1400, $01)
            TXZDB46B02X = createtexture(local2, local3, $403, $01)
            T20Z2020X22 = createtexture(local2, local3, $C00, $01)
            TDB84FBX46 = createtexture(local2, local3, $1400, $01)
            X2BFB86264 = createtexture(local2, local3, $1400, $01)
            XFB40886X8 = createtexture(local2, local3, $1400, $01)
            X8DZ8X06XF = createtexture(local2, local3, $1400, $01)
        Else
            T22FB2Z0B2 = createtexture(local2, local3, $20400, $01)
            TXZDB46B02X = createtexture(local2, local3, $403, $01)
            T20Z2020X22 = createtexture(local2, local3, $C00, $01)
            TDB84FBX46 = createtexture(local2, local3, $1400, $01)
            X2BFB86264 = createtexture(local2, local3, $20400, $01)
            XFB40886X8 = createtexture(local2, local3, $20400, $01)
            X8DZ8X06XF = createtexture(local2, local3, $20400, $01)
        EndIf
        If (((1.0 <> TX8BB24F442) Lor (1.0 <> TXF0FBX4F06)) <> 0) Then
            T6X8280DX8 = createtexture(local2, local3, $80000, $01)
        EndIf
        TX6D2F2B600 = GUESSEDcreateadd($02)
        XBFB62Z0F0 = GUESSEDcreateadd($03)
        TX228822BX8 = GUESSEDcreateadd($01)
        T204DXXFX02 = createcube($00)
        entitytexture(T204DXXFX02, TXZDB46B02X, $00, $00)
        entitytexture(T204DXXFX02, TDB84FBX46, $00, $01)
        entitytexture(T204DXXFX02, T20Z2020X22, $00, $02)
        entityorder(T204DXXFX02, $989680)
        entityblend(T204DXXFX02, $03)
        entityfx(T204DXXFX02, $08)
        entitytexture(TX6D2F2B600, TXZDB46B02X, $00, $00)
        entitytexture(TX6D2F2B600, TDB84FBX46, $00, $01)
        entitytexture(TX6D2F2B600, T20Z2020X22, $00, $02)
        entitytexture(TX6D2F2B600, TXXZ6F0FF6B, $00, $03)
        entitytexture(TX6D2F2B600, TXD22D8BDXZ, $00, $04)
        entityorder(TX6D2F2B600, $989680)
        entityblend(TX6D2F2B600, $03)
        entityfx(TX6D2F2B600, $08)
        entitytexture(XBFB62Z0F0, TXZDB46B02X, $00, $00)
        entitytexture(XBFB62Z0F0, TDB84FBX46, $00, $01)
        entitytexture(XBFB62Z0F0, T20Z2020X22, $00, $02)
        entitytexture(XBFB62Z0F0, TXXZ6F0FF6B, $00, $03)
        entitytexture(XBFB62Z0F0, TXD22D8BDXZ, $00, $04)
        entityorder(XBFB62Z0F0, $989680)
        entityblend(XBFB62Z0F0, $03)
        entityfx(XBFB62Z0F0, $08)
        entitytexture(TX228822BX8, TXZDB46B02X, $00, $00)
        entitytexture(TX228822BX8, TDB84FBX46, $00, $01)
        entitytexture(TX228822BX8, T20Z2020X22, $00, $02)
        entitytexture(TX228822BX8, TXXZ6F0FF6B, $00, $03)
        entitytexture(TX228822BX8, TXD22D8BDXZ, $00, $04)
        entityorder(TX228822BX8, $989680)
        entityblend(TX228822BX8, $03)
        entityfx(TX228822BX8, $08)
        hideentity(TX6D2F2B600)
        hideentity(XBFB62Z0F0)
        hideentity(TX228822BX8)
        hideentity(T204DXXFX02)
        maskentity(TX6D2F2B600, $04)
        maskentity(XBFB62Z0F0, $04)
        maskentity(TX228822BX8, $04)
        maskentity(T204DXXFX02, $04)
        GUESSEDfreetex()
        GUESSEDcreatebank_5()
    EndIf
    Return $00
End Function
