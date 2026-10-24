Function T20BFF42662%(arg0%, arg1#, arg2#, arg3#)
    Local local0%
    Local local1%
    Local local2#
    Local local3#
    Local local4%
    arg0 = (Int clamp((Float arg0), 1.0, 4096.0))
    local0 = createtexture(arg0, arg0, $89, $01)
    positionentity(camera, arg1, arg2, arg3, $00)
    cameraprojmode(camera, $01)
    cameraviewport(camera, $00, $00, opt\Field21, opt\Field46)
    camerazoom(camera, 1.0)
    camerarange(camera, 0.1, 100.0)
    local1 = opt\Field70
    opt\Field70 = $00
    local2 = ((Float arg0) / (Float opt\Field21))
    local3 = ((Float arg0) / (Float opt\Field46))
    fog\Field8 = 0.0
    fog\Field15 = 0.0
    fog\Field5 = 0.0
    For local4 = $00 To $05 Step $01
        setcubeface(local0, local4)
        rotateentity(camera, Y08F028F68[local4], TXB08482FZ2[local4], 0.0, $00)
        TX0F0BX6X46(camera, 1.0, local2, local3, $01, $00)
        copyrectstretch($00, $00, texturewidth(TXZDB46B02X), textureheight(TXZDB46B02X), $00, $00, arg0, arg0, texturebuffer(TXZDB46B02X, $00), texturebuffer(local0, $00))
    Next
    opt\Field70 = local1
    cameraprojmode(camera, $00)
    Return local0
    Return $00
End Function
