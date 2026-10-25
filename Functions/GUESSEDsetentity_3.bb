Function GUESSEDsetentity_3%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5#, arg6#)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local5%
    Local local6%
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    local1 = texturewidth(arg2)
    local2 = textureheight(arg2)
    local3 = GUESSEDgettex(local1, local2)
    If (local3 = $00) Then
        Return $00
    EndIf
    setbuffer(texturebuffer(local3, $00), $00, $00)
    Select arg3
        Case $01
            positionentity(TX406Z20Z24, entityx(arg4, $01, 0.0), entityy(arg4, $01, 0.0), entityz(arg4, $01, 0.0), $00)
            rotateentity(TX406Z20Z24, entitypitch(arg4, $01, 0.0), entityyaw(arg4, $01, 0.0), 0.0, $00)
            captureentity(TX406Z20Z24)
            positionentity(TX406Z20Z24, entityx(arg4, $01, 1.0), entityy(arg4, $01, 1.0), entityz(arg4, $01, 1.0), $00)
            rotateentity(TX406Z20Z24, entitypitch(arg4, $01, 1.0), entityyaw(arg4, $01, 1.0), 0.0, $00)
            moveentity(TX406Z20Z24, 0.0, 0.0, -20.0, $00)
            cameradepthbias(TX406Z20Z24, (XF808DD2ZX * 18.0), FBXZ62B06)
            camerarange(TX406Z20Z24, 0.1, 35.0)
            cameraprojmode(TX406Z20Z24, $02)
            camerazoom(TX406Z20Z24, 0.01)
            cameraviewport(TX406Z20Z24, $00, $00, local1, local2)
            setbuffer(texturebuffer(arg2, $00), $00, $00)
            clscolor($FF, $00, $00, $FF)
            cls()
            clscolor($00, $00, $00, $FF)
            setbuffer(texturebuffer(local3, $00), texturebuffer(arg2, $00), $00)
            renderworld(TX20ZZFFX0Z, TX406Z20Z24)
            GUESSEDrenderbatches()
            effectint(arg0, "ShadowMapAddress", $04, $00)
            effectfloat(arg0, "NormalOffset", 0.0, $00)
        Case $02
            camerarange(TX406Z20Z24, (0.005 * arg5), arg5)
            cameraprojmode(TX406Z20Z24, $01)
            camerazoom(TX406Z20Z24, 1.0)
            cameradepthbias(TX406Z20Z24, XF808DD2ZX, FBXZ62B06)
            setbuffer(texturebuffer(arg2, $00), $00, $00)
            clscolor($FF, $00, $00, $FF)
            cls()
            clscolor($00, $00, $00, $FF)
            setbuffer(texturebuffer(local3, $00), texturebuffer(arg2, $00), $00)
            local5 = (local1 / $06)
            local6 = local2
            local7 = (TXZZF0BZF4 * arg5)
            local8 = entityx(arg4, $01, 0.0)
            local9 = entityy(arg4, $01, 0.0)
            local10 = entityz(arg4, $01, 0.0)
            local11 = entityx(arg4, $01, 1.0)
            local12 = entityy(arg4, $01, 1.0)
            local13 = entityz(arg4, $01, 1.0)
            positionentity(XBFB62Z0F0, entityx(arg4, $01, TX20ZZFFX0Z), entityy(arg4, $01, TX20ZZFFX0Z), entityz(arg4, $01, TX20ZZFFX0Z), $00)
            For local0 = $00 To $05 Step $01
                rotateentity(XBFB62Z0F0, Y08F028F68[local0], TXB08482FZ2[local0], 0.0, $00)
                scaleentity(XBFB62Z0F0, local7, local7, arg5, $00)
                If (entityinview(XBFB62Z0F0, arg1) <> 0) Then
                    positionentity(TX406Z20Z24, local8, local9, local10, $00)
                    rotateentity(TX406Z20Z24, Y08F028F68[local0], TXB08482FZ2[local0], 0.0, $00)
                    captureentity(TX406Z20Z24)
                    positionentity(TX406Z20Z24, local11, local12, local13, $00)
                    cameraviewport(TX406Z20Z24, (local0 * local5), $00, local5, local6)
                    renderworld(TX20ZZFFX0Z, TX406Z20Z24)
                    GUESSEDrenderbatches()
                    effectmatrix(arg0, ("LightViewProj" + (Str local0)), cameramatrix(TX406Z20Z24, $02, TX20ZZFFX0Z), $00)
                EndIf
            Next
            local14 = ((2.0 * TXZZF0BZF4) * arg5)
            local14 = (local14 * X8D40BB8XF)
            effectfloat(arg0, "NormalOffset", local14, $00)
            effectint(arg0, "ShadowMapAddress", $03, $00)
        Case $03
            setbuffer(texturebuffer(arg2, $00), $00, $00)
            clscolor($FF, $00, $00, $FF)
            cls()
            clscolor($00, $00, $00, $FF)
            setbuffer(texturebuffer(local3, $00), texturebuffer(arg2, $00), $00)
            renderworld(TX20ZZFFX0Z, TX406Z20Z24)
            GUESSEDrenderbatches()
            local14 = ((tan((arg6 * 0.5)) * 2.0) * arg5)
            local14 = (local14 * X8D40BB8XF)
            effectfloat(arg0, "NormalOffset", local14, $00)
            effectint(arg0, "ShadowMapAddress", $03, $00)
    End Select
    effectvector(arg0, "ShadowMapSize", (Float local1), (Float local2), 0.0, 0.0, $00)
    effecttexture(arg0, "tShadowMap", arg2, $00)
    Return $00
End Function
