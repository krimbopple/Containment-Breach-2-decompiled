Function GUESSEDsettex_2%(arg0.D6BZZF0B6, arg1$, arg2%, arg3%)
    Local local0%
    Local local1%
    Local local2%
    Local local3#
    Local local4#
    Local local5$
    Local local6%
    Local local7%
    Local local8%
    Local local9#
    Local local10%
    Local local11%
    Local local12#
    Local local13%
    Local local14.TX4BBZDZ08F
    If (arg0 = Null) Then
        Return $00
    EndIf
    local0 = createsprite($00)
    setfont(arg0\Field1)
    local2 = createtexture($400, (Int arg0\Field3), $433, $01)
    If (local2 <> $00) Then
        local3 = (Float texturewidth(local2))
        setbuffer(texturebuffer(local2, $00), $00, $00)
        arg1 = GUESSEDgettask(arg1)
        local11 = len(arg1)
        local12 = (Float stringwidth(replace(arg1, chr($03), "X")))
        color($FF, $FF, $FF, $FF)
        For local1 = $01 To local11 Step $01
            local5 = mid(arg1, local1, $01)
            local10 = (Int (((local3 / 2.0) + local4) - (local12 / 2.0)))
            local13 = $00
            For local14 = Each TX4BBZDZ08F
                If (((local14\Field3 = $01) And ((local1 - $01) >= local14\Field2)) <> 0) Then
                    local13 = $01
                    Exit
                EndIf
            Next
            If (local13 = $00) Then
                local9 = ((Float local1) / (Float local11))
                local6 = (Int (((Float readpixelcolor(arg2, $10)) * (1.0 - local9)) + ((Float readpixelcolor(arg3, $10)) * local9)))
                local7 = (Int (((Float readpixelcolor(arg2, $08)) * (1.0 - local9)) + ((Float readpixelcolor(arg3, $08)) * local9)))
                local8 = (Int (((Float readpixelcolor(arg2, $00)) * (1.0 - local9)) + ((Float readpixelcolor(arg3, $00)) * local9)))
                color(local6, local7, local8, $FF)
            EndIf
            FormatText((Float local10), 0.0, local5, $00, $00, 1.0, $00, 0.0)
            local4 = (((Float stringwidth(replace(local5, chr($03), "X"))) * arg0\Field0) + local4)
        Next
        setbuffer(backbuffer(), $00, $00)
        entitytexture(local0, local2, $00, $00)
        GUESSEDcreatesurface(local0, $60, $FFFFFFFF)
        GUESSEDfreeentity_7(local0, $60, $00)
        freetexture(local2)
    EndIf
    Return local0
    Return $00
End Function
