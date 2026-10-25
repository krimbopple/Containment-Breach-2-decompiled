Function createparticle.particles(arg0%, arg1#, arg2#, arg3#, arg4#, arg5#, arg6#)
    Local local0.particles
    catcherrors((((((((((((((("CreateParticle(" + (Str arg0)) + ", ") + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)) + ", ") + (Str arg4)) + ", ") + (Str arg5)) + ", ") + (Str arg6)) + ")"))
    local0 = (New particles)
    local0\Field4 = createsprite($00)
    positionentity(local0\Field4, arg1, arg2, arg3, $01)
    entitytexture(local0\Field4, p_i\Field0[arg0], $00, $00)
    rotateentity(local0\Field4, 0.0, 0.0, rnd(360.0, 0.0), $00)
    spriteviewmode(local0\Field4, $03)
    Select arg0
        Case $00,$01,$03,$06
            entityfx(local0\Field4, $01)
            entityblend(local0\Field4, $01)
        Case $02,$04,$05,$07
            entityfx(local0\Field4, $09)
            entityblend(local0\Field4, $03)
    End Select
    local0\Field10 = createpivot($00)
    positionentity(local0\Field10, arg1, arg2, arg3, $01)
    local0\Field8 = arg6
    local0\Field2 = (arg5 * 0.004)
    local0\Field13 = 1.0
    local0\Field3 = arg4
    scalesprite(local0\Field4, local0\Field3, local0\Field3)
    GUESSEDcreateparticle(local0\Field4, $01)
    If (p_i\Field0[arg0] = $00) Then
        runtimeerrorex(format(getlocalstring("runerr", "particle"), (Str arg0), "%s"))
    EndIf
    catcherrors((((((((((((((("Uncaught: CreateParticle(" + (Str arg0)) + ", ") + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)) + ", ") + (Str arg4)) + ", ") + (Str arg5)) + ", ") + (Str arg6)) + ")"))
    entitydestructor(local0\Field4, FuncPtr(X26844ZD86))
    entitydestructor(local0\Field10, FuncPtr(X26844ZD86))
    Return local0
    Return Null
End Function
