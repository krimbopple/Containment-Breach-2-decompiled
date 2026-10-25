Function createsecuritycam.securitycams(arg0.rooms, arg1#, arg2#, arg3#, arg4#, arg5%, arg6#, arg7#, arg8#, arg9#, arg10#, arg11#)
    Local local0.securitycams
    Local local1#
    Local local2#
    Local local3#
    local0 = (New securitycams)
    local0\Field6 = arg0
    local0\Field10 = $00
    local0\Field5 = $00
    local0\Field0 = copyentity(sc_i\Field3[$00], $00)
    scaleentity(local0\Field0, 0.0015, 0.0015, 0.0015, $00)
    positionentity(local0\Field0, arg1, arg2, arg3, $00)
    If (arg0 <> Null) Then
        entityparent(local0\Field0, arg0\Field15, $01)
    EndIf
    hideentity(local0\Field0)
    local0\Field7 = copyentity(sc_i\Field3[$01], $00)
    scaleentity(local0\Field7, 0.01, 0.01, 0.01, $00)
    rotateentity(local0\Field7, arg4, 0.0, 0.0, $00)
    hideentity(local0\Field7)
    GUESSEDcreatesurface(local0\Field0, $00, $FFFFFFFF)
    GUESSEDcreatesurface(local0\Field7, $00, $FFFFFFFF)
    local0\Field12 = arg5
    If (arg5 <> 0) Then
        local0\Field17 = $01
        local0\Field9 = opt\Field27
        local1 = (1.0 / 142.2222)
        local2 = ((meshwidth(mon_i\Field3[$00]) * local1) * 0.475)
        local3 = ((meshheight(mon_i\Field3[$00]) * local1) * 0.475)
        local0\Field3 = createquad($00)
        scaleentity(local0\Field3, local2, local3, 1.0, $00)
        positionentity(local0\Field3, arg6, arg7, arg8, $00)
        moveentity(local0\Field3, 0.0, 0.0, -0.01, $00)
        rotateentity(local0\Field3, arg9, arg10, arg11, $00)
        entityfx(local0\Field3, $10)
        If (arg0 <> Null) Then
            entityparent(local0\Field3, arg0\Field15, $01)
        EndIf
        hideentity(local0\Field3)
        GUESSEDcreatesurface(local0\Field3, $00, $420)
        entitytexture(local0\Field3, sc_i\Field0, $00, $00)
        entitycolor(local0\Field3, 200.0, 200.0, 200.0)
        local0\Field22 = createsprite(local0\Field3)
        scalesprite(local0\Field22, 1.0, 1.0)
        moveentity(local0\Field22, 0.0, 0.0, -0.005, $00)
        entitytexture(local0\Field22, mon_i\Field2[$00], $00, $00)
        spriteviewmode(local0\Field22, $02)
        entityfx(local0\Field22, $11)
        entityblend(local0\Field22, $03)
        GUESSEDcreatesurface(local0\Field22, $00, $60)
        hideentity(local0\Field22)
        local0\Field15 = copyentity(mon_i\Field3[$00], local0\Field3)
        scaleentity(local0\Field15, local1, local1, local1, $01)
        local0\Field21 = createcamera($00)
        cameraviewport(local0\Field21, $00, $00, $200, $200)
        camerarange(local0\Field21, 0.05, 8.0)
        camerazoom(local0\Field21, 0.8)
        If (local0\Field6\Field22\Field21 <> $04) Then
            camerafogmode(local0\Field21, $01)
            camerafogrange(local0\Field21, 0.1, 6.0)
        EndIf
        hideentity(local0\Field21)
    EndIf
    Return local0
    Return Null
End Function
