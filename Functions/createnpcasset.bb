Function createnpcasset%(arg0.npcs)
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Select arg0\Field77
        Case $17
            If (npcsound[$08] = $00) Then
                npcsound[$08] = loadsound_strict("SFX\Character\Vehicle\Idle.ogg")
            EndIf
            If (npcsound[$09] = $00) Then
                npcsound[$09] = loadsound_strict("SFX\Character\Vehicle\Move.ogg")
            EndIf
            local1 = entityyaw(arg0\Field98, $00, 1.0)
            local3 = entityx(arg0\Field98, $00, 1.0)
            local4 = entityy(arg0\Field98, $00, 1.0)
            local5 = entityz(arg0\Field98, $00, 1.0)
            rotateentity(arg0\Field98, 0.0, -180.0, 0.0, $00)
            positionentity(arg0\Field98, 0.0, 0.0, 0.0, $00)
            arg0\Field101 = copyentity(n_i\Field9[$20], $00)
            local0 = 0.116
            local0 = ((local0 + 1.68) / meshwidth(arg0\Field101))
            scaleentity(arg0\Field101, local0, local0, local0, $00)
            positionentity(arg0\Field98, -0.42, 0.3, 1.75, $01)
            rotateentity(arg0\Field98, 0.0, (entityyaw(arg0\Field101, $01, 1.0) + 180.0), 0.0, $01)
            entityparent(arg0\Field98, arg0\Field101, $01)
            hideentity(arg0\Field101)
            positionentity(arg0\Field101, local3, local4, local5, $00)
            rotateentity(arg0\Field101, 0.0, (local1 + 180.0), 0.0, $00)
        Case $16
            If (arg0\Field101 <> $00) Then
                entityparent(arg0\Field101, $00, $01)
                freeentity(arg0\Field101)
                arg0\Field101 = $00
            EndIf
            local1 = entityyaw(arg0\Field98, $00, 1.0)
            local3 = entityx(arg0\Field98, $00, 1.0)
            local4 = entityy(arg0\Field98, $00, 1.0)
            local5 = entityz(arg0\Field98, $00, 1.0)
            local2 = animtime(arg0\Field98)
            rotateentity(arg0\Field98, 0.0, 0.0, 0.0, $00)
            positionentity(arg0\Field98, 0.0, 0.0, 0.0, $00)
            setnpcframe(arg0, 1.0, $01)
            If (i_035\Field0 <> 0) Then
                arg0\Field101 = loadmesh_strict("GFX\NPCs\scp_035_sad.b3d", $00, $01)
            Else
                arg0\Field101 = loadmesh_strict("GFX\NPCs\scp_035_smile.b3d", $00, $01)
            EndIf
            local0 = (0.51 / meshwidth(arg0\Field98))
            scaleentity(arg0\Field101, local0, local0, local0, $01)
            positionentity(arg0\Field101, 0.0, 0.86, -0.094, $01)
            rotateentity(arg0\Field101, 0.0, entityyaw(arg0\Field98, $01, 1.0), 0.0, $01)
            entityparent(arg0\Field101, findchild(arg0\Field98, "Bip01_Head"), $01)
            rotateentity(arg0\Field98, 0.0, local1, 0.0, $00)
            positionentity(arg0\Field98, local3, local4, local5, $00)
            setnpcframe(arg0, local2, $01)
    End Select
    If (arg0\Field101 <> $00) Then
        YX2D2860X(arg0\Field101, $01, $FFFFFFFF)
    EndIf
    arg0\Field79 = $01
    Return $00
End Function
