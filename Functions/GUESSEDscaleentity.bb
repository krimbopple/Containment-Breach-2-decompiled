Function GUESSEDscaleentity%(arg0.items, arg1$, arg2#, arg3#, arg4#, arg5%, arg6%, arg7%, arg8#, arg9%)
    Local local0#
    Local local1#
    Local local2#
    Local local3%
    Local local5%
    local0 = entityscalex(arg0\Field6\Field21, $01, 1.0)
    local1 = entityscaley(arg0\Field6\Field21, $01, 1.0)
    local2 = entityscalez(arg0\Field6\Field21, $01, 1.0)
    arg0\Field9 = createpivot($00)
    GUESSEDsetentitycollision(arg0\Field6\Field7, arg0\Field9, arg0\Field6\Field21, local0, local1, local2)
    arg0\Field5 = GUESSEDcopyentity_2(arg0\Field6\Field21, arg0\Field9)
    GUESSEDloadmask(arg0\Field5, (opt\Field76 >= $03))
    arg0\Field24 = arg0\Field6\Field24
    arg0\Field19 = arg1
    showentity(arg0\Field9)
    showentity(arg0\Field5)
    resetentity(arg0\Field9)
    positionentity(arg0\Field9, arg2, arg3, arg4, $01)
    rotateentity(arg0\Field9, 0.0, rnd(360.0, 0.0), 0.0, $00)
    arg0\Field28 = $01
    arg0\Field44 = entitydistancesquared(XZ0260X8X2\Field74, arg0\Field9)
    arg0\Field35 = 0.0
    arg0\Field20 = arg0\Field6\Field14
    Select arg0\Field6\Field9
        Case $2B
            arg0\Field16 = arg5
            arg0\Field14 = arg6
            arg0\Field38 = arg7
            arg0\Field1 = arg8
            arg0\Field15 = 1.0
            local5 = GUESSEDcopyentity_2(misc_i\Field4, $00)
            scaleentity(local5, arg0\Field6\Field8, arg0\Field6\Field8, arg0\Field6\Field8, $01)
            positionentity(local5, entityx(arg0\Field9, $01, 1.0), entityy(arg0\Field9, $01, 1.0), entityz(arg0\Field9, $01, 1.0), $00)
            entityparent(local5, arg0\Field5, $01)
            entitycolor(local5, (Float arg5), (Float arg6), (Float arg7))
            entityfx(local5, $20)
            If (0.0 > arg8) Then
                entityfx(local5, $21)
            EndIf
            entityalpha(local5, (Abs arg8))
            entityshininess(local5, 1.0, 0.5)
        Case $2D,$2E,$13
            If (arg9 = $00) Then
                arg9 = (((arg0\Field6\Field9 = $13) * $0A) + $0A)
                setanimtime(arg0\Field5, ((((Float (arg0\Field6\Field9 = $2D)) * 17.0) + ((Float (arg0\Field6\Field9 = $2E)) * 2.0)) + ((Float (arg0\Field6\Field9 = $13)) * 11.0)), $00)
                If (arg0\Field6\Field10 <> $00) Then
                    arg0\Field20 = arg0\Field6\Field10
                EndIf
            EndIf
        Case $24
            arg0\Field15 = (Float rand($02, $08))
            local3 = CreateLight($02, arg0\Field9)
            LightRange(local3, 0.15)
            LightColor(local3, $FF, $FF, $14)
            GUESSEDsetfillroom(local3, 0.0)
            moveentity(local3, 0.0, 0.1, 0.0, $00)
        Case $25
            local3 = CreateLight($02, arg0\Field9)
            LightRange(local3, 0.15)
            LightColor(local3, $FF, $FF, $14)
            GUESSEDsetfillroom(local3, 0.0)
            moveentity(local3, 0.0, 0.1, 0.0, $00)
            arg0\Field12 = createsprite($00)
            positionentity(arg0\Field12, arg2, arg3, arg4, $00)
            scalesprite(arg0\Field12, 0.03, 0.03)
            entitytexture(arg0\Field12, misc_i\Field1, $00, $00)
            entityfx(arg0\Field12, $09)
            entityblend(arg0\Field12, $03)
            entitycolor(arg0\Field12, 255.0, 255.0, 20.0)
            rotateentity(arg0\Field12, 0.0, 0.0, rnd(360.0, 0.0), $00)
            entityalpha(arg0\Field12, 0.6)
            spriteviewmode(arg0\Field12, $01)
            entityparent(arg0\Field12, arg0\Field9, $01)
        Case $7C
            If (arg9 = $00) Then
                arg9 = $0A
            EndIf
    End Select
    arg0\Field36 = arg9
    GUESSEDloadgame(arg0, $00)
    Return $00
End Function
