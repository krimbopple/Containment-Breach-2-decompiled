Function GUESSEDloadflash%()
    Local local0.T24B4ZF6F6
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5$
    If (TXZ2626X424[$00] = Null) Then
        runtimeerrorex("Weapon error")
    EndIf
    DZ64X028\Field46 = $00
    DZ64X028\Field32 = 0.0
    DZ64X028\Field58 = 0.0
    DZ64X028\Field40 = 0.0
    DZ64X028\Field7 = $00
    DZ64X028\Field1 = $00
    DZ64X028\Field69 = $00
    DZ64X028\Field23 = createpivot($00)
    DZ64X028\Field41 = loadmesh_strict("GFX\Items\Weapons\MuzzleFlash\Mflash.b3d", $00, $01)
    GUESSEDgetbrush(DZ64X028\Field41, loadtexture_strict("GFX\Items\Weapons\MuzzleFlash\Textures\MuzzleFlash4(0).png", $03, $01, 1.0), $01, $FFFFFFFF, $FF, $FF, $FF)
    GUESSEDgetbrush(DZ64X028\Field41, loadtexture_strict("GFX\Items\Weapons\MuzzleFlash\Textures\MuzzleFlash3(1).png", $03, $01, 1.0), $02, $FFFFFFFF, $FF, $FF, $FF)
    entityalpha(DZ64X028\Field41, 0.8)
    hideentity(DZ64X028\Field41)
    GUESSEDcreatesurface(DZ64X028\Field41, $00, $60)
    DZ64X028\Field65 = loadmesh_strict("GFX\Items\Weapons\MuzzleFlash\MuzzleFlash_FP.b3d", $00, $01)
    scalemesh(DZ64X028\Field65, 0.85, 0.85, 0.85)
    entityfx(DZ64X028\Field65, $20)
    hideentity(DZ64X028\Field65)
    GUESSEDcreatesurface(DZ64X028\Field65, $00, $60)
    DZ64X028\Field56[$00] = loadtexture_strict("GFX\Items\Weapons\MuzzleFlash\Textures\FP\muzzle_flash_01.png", $03, $01, 1.0)
    DZ64X028\Field56[$01] = loadtexture_strict("GFX\Items\Weapons\MuzzleFlash\Textures\FP\muzzle_flash_02.png", $03, $01, 1.0)
    DZ64X028\Field56[$02] = loadtexture_strict("GFX\Items\Weapons\MuzzleFlash\Textures\FP\muzzle_flash_03.png", $03, $01, 1.0)
    DZ64X028\Field56[$03] = loadtexture_strict("GFX\Items\Weapons\MuzzleFlash\Textures\FP\muzzle_flash_04.png", $03, $01, 1.0)
    GUESSEDloadentity_4()
    entityfx(GUESSEDgetglobal_7(), $20)
    GUESSEDcreatesurface(GUESSEDgetglobal_7(), $00, $60)
    DZ64X028\Field28 = $00
    For local0 = Each T24B4ZF6F6
        local0\Field2 = findchild(local0\Field9, "CameraBone")
        If (local0\Field3\Field10 <> "") Then
            local0\Field1 = findchild(local0\Field9, local0\Field3\Field10)
        EndIf
        If (((local0\Field3\Field48 <> "") And GUESSEDcallfiletype(local0\Field3\Field48)) <> 0) Then
            local0\Field0 = loadmesh_strict(local0\Field3\Field48, $00, $01)
            scaleentity(local0\Field0, local0\Field3\Field16, local0\Field3\Field16, local0\Field3\Field16, $00)
            hideentity(local0\Field0)
        EndIf
        entityalpha(local0\Field9, 0.0)
        captureentity(local0\Field9)
        For local1 = $01 To $08 Step $01
            local2 = $00
            local3 = $00
            If (local0\Field3\Field20[local1] <> $00) Then
                local2 = GetFirstPackedValue(local0\Field3\Field20[local1])
                local3 = GetSecondPackedValue(local0\Field3\Field20[local1])
            EndIf
            extractanimseq(local0\Field9, local2, local3, $00, "")
        Next
        scaleentity(local0\Field4, local0\Field3\Field47, local0\Field3\Field47, local0\Field3\Field47, $00)
        local0\Field3\Field45 = $00
        If (instr(local0\Field3\Field25, ".", $01) < $01) Then
            local4 = readdir(local0\Field3\Field25)
            If (local4 <> $00) Then
                Repeat
                    local5 = nextfile(local4)
                    If (local5 = "") Then
                        Exit
                    EndIf
                    If (instr(local5, "shoot", $01) <> 0) Then
                        GUESSEDsetmap_2((((local0\Field3\Field25 + "shoot") + (Str local0\Field3\Field45)) + ".ogg"))
                        local0\Field3\Field45 = (local0\Field3\Field45 + $01)
                    EndIf
                Forever
                closedir(local4)
            EndIf
        ElseIf (local0\Field3\Field25 <> "") Then
            GUESSEDsetmap_2(local0\Field3\Field25)
        EndIf
    Next
    Return $00
End Function
