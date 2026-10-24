Function TX4ZB8FDXFZ%(arg0%, arg1%, arg2#, arg3#, arg4%, arg5%, arg6%, arg7#, arg8%, arg9#, arg10%, arg11#)
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7%
    Local local8#
    Local local9#
    Local local10%
    Local local11%
    Local local13%
    If (0.0 >= arg7) Then
        Return $00
    EndIf
    local0 = entitydistance(arg0, arg1)
    If (getcamerarangefar(arg0) < (local0 - arg2)) Then
        Return $00
    EndIf
    local1 = entityx(arg1, $01, TX20ZZFFX0Z)
    local2 = entityy(arg1, $01, TX20ZZFFX0Z)
    local3 = entityz(arg1, $01, TX20ZZFFX0Z)
    local4 = entitypitch(arg1, $01, TX20ZZFFX0Z)
    local5 = entityyaw(arg1, $01, TX20ZZFFX0Z)
    local6 = (arg2 * 1.25)
    local9 = 1.0
    local10 = XZ0XDFBZ28(arg8)
    If ((arg10 And (arg8 <> $01)) <> 0) Then
        local9 = T2640FXDZF(max((local0 - arg2), 0.0), (TXFBB2B406D * X4D002X88), TXFBB2B406D)
        If (0.0 >= local9) Then
            arg10 = $00
        EndIf
    EndIf
    If (arg10 <> 0) Then
        local10 = (local10 Or $08)
    EndIf
    If (0.0 < arg11) Then
        local10 = (local10 Or CZXD2X8XX[opt\Field71])
    EndIf
    If (0.0 < arg3) Then
        local10 = (local10 Or $10)
    EndIf
    local11 = TX22BX46F8(local10)
    If (arg10 = $00) Then
        effectfloat(local11, "NormalOffset", 0.0, $00)
    EndIf
    arg9 = clamp(arg9, 0.0, 170.0)
    Select arg8
        Case $02
            local7 = TX6D2F2B600
            positionentity(local7, local1, local2, local3, $00)
            scaleentity(local7, local6, local6, local6, $00)
            If (entityinview(local7, arg0) = $00) Then
                Return $00
            EndIf
            If (arg10 <> 0) Then
                EXFD8FBZF(local11, arg0, TFB4468X2Z[X6684FB04X(arg2, local0)], arg8, arg1, arg2, arg9)
            EndIf
            camerarange(arg0, 0.01, (((arg2 * 2.0) + local0) + (local0 * arg2)))
        Case $03
            local8 = tan((arg9 * 0.5))
            local7 = TX6D2F2B600
            positionentity(local7, local1, local2, local3, $00)
            scaleentity(local7, local6, local6, local6, $00)
            If (entityinview(local7, arg0) = $00) Then
                Return $00
            EndIf
            local13 = TX40B804D6D[X6684FB04X(arg2, local0)]
            positionentity(TX406Z20Z24, entityx(arg1, $01, 0.0), entityy(arg1, $01, 0.0), entityz(arg1, $01, 0.0), $00)
            rotateentity(TX406Z20Z24, entitypitch(arg1, $01, 0.0), entityyaw(arg1, $01, 0.0), 0.0, $00)
            captureentity(TX406Z20Z24)
            positionentity(TX406Z20Z24, entityx(arg1, $01, 1.0), entityy(arg1, $01, 1.0), entityz(arg1, $01, 1.0), $00)
            rotateentity(TX406Z20Z24, entitypitch(arg1, $01, 1.0), entityyaw(arg1, $01, 1.0), 0.0, $00)
            camerarange(TX406Z20Z24, (0.005 * arg2), arg2)
            cameraprojmode(TX406Z20Z24, $01)
            camerazoom(TX406Z20Z24, (1.0 / local8))
            cameraviewport(TX406Z20Z24, $00, $00, texturewidth(local13), textureheight(local13))
            cameradepthbias(TX406Z20Z24, XF808DD2ZX, FBXZ62B06)
            If (arg10 <> 0) Then
                EXFD8FBZF(local11, arg0, local13, arg8, arg1, arg2, arg9)
            EndIf
            effectmatrix(local11, "LightViewProj", cameramatrix(TX406Z20Z24, $02, TX20ZZFFX0Z), $00)
            If (0.0 < arg11) Then
                camerarange(arg0, 0.01, (((arg2 * 2.0) + local0) + (local0 * arg2)))
            Else
                camerarange(arg0, 0.01, 1000000.0)
            EndIf
        Case $01
            local7 = TX228822BX8
            If (arg10 <> 0) Then
                EXFD8FBZF(local11, arg0, TX40B804D6D[$01], arg8, arg1, arg2, arg9)
            EndIf
            arg0 = XFXFXB6F68
            effectmatrix(local11, "LightViewProj", cameramatrix(TX406Z20Z24, $02, 1.0), $00)
    End Select
    arg7 = (XF28BZ6DDD(opt\Field50, 1.0, 0.8) * arg7)
    effectvector(local11, "LightPos", local1, local2, local3, (1.0 / max(arg2, 0.0001)), $00)
    effectvector(local11, "LightColor", (((Float arg4) / 255.0) * arg7), (((Float arg5) / 255.0) * arg7), (((Float arg6) / 255.0) * arg7), 0.0, $00)
    effectvector(local11, "LightDirection", sin((- local5)), tan((- local4)), cos((- local5)), 0.0, $00)
    effectfloat(local11, "ShadowIntensity", (1.0 - local9), $00)
    effectint(local11, "Time", millisecs(), $00)
    If (0.0 < arg3) Then
        effectfloat(local11, "LightLength", arg3, $00)
    EndIf
    If (0.0 < arg11) Then
        effectfloat(local11, "LightScattering", arg11, $00)
    EndIf
    entityeffect(local7, local11)
    setbuffer(texturebuffer(X2BFB86264, $00), XB0080D6B2(), $00)
    If ((local10 And $20) <> $00) Then
        setbuffer(texturebuffer(XFB40886X8, $00), XB0080D6B2(), $01)
    EndIf
    renderentity(arg0, local7, NAN)
    If ((local10 And $20) <> $00) Then
        setbuffer($00, $00, $01)
    EndIf
    T86XBX88XD()
    Return $00
End Function
