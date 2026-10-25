Function GUESSEDplayid%(arg0$, arg1%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7$
    Local local8.X44ZF6442X
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17%
    Local local18$
    Local local19.itemtemplates
    Local local20%
    Local local21.X0442B862F
    Local local22%
    Local local23.TB86B8F2BX
    Local local24%
    Local local25$
    Local local26.itemtemplates
    Local local27.itemtemplates
    Local local28$
    Local local29.templights
    Local local30.roomtemplates
    Local local31.template
    Local local32%
    Local local33%
    Local local34%
    Local local35$
    Local local36$
    Local local37%
    Local local38%
    Local local39%
    Local local40%
    Print((("Loading " + arg0) + "..."))
    local0 = $00
    If (arg1 = $00) Then
        
        local0 = eax_0012
    Else
        
        local0 = eax_001A
    EndIf
    If (_JsonHasParseError(local0) <> 0) Then
        Print(((("ERROR: " + GUESSEDhandleinvalid(_JsonGetParseErrorCode(local0))) + " at ") + (Str _JsonGetParseErrorCode(local0))))
        _JsonFreeDocument(local0)
        Return $00
    EndIf
    local1 = _JsonGetValue(local0, "playermodels")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                local7 = GUESSEDgetarg1(local5, "", "filename")
                If (local7 = "") Then
                    Print("ERROR: Filename mustn't be empty")
                ElseIf (((local6 > $00) And (local6 < $40)) <> 0) Then
                    GUESSEDhideentity_2(local6, local7)
                    local8 = GUESSEDcheckvalue_12(local6)
                    local8\Field56 = GUESSEDgetbool_3(local5, local8\Field56, "offsety")
                    local8\Field47 = GUESSEDgetbool_3(local5, local8\Field47, "offsetyaw")
                    local8\Field30 = GUESSEDgetarg1(local5, local8\Field30, "headbone")
                    local8\Field21 = GUESSEDgetarg1(local5, local8\Field21, "spinebone")
                    local8\Field31 = GUESSEDgetarg1(local5, local8\Field31, "handbone")
                    local8\Field53 = GUESSEDgetarg1(local5, local8\Field53, "forearmbone")
                    local8\Field37 = (Int GUESSEDgetbool_3(local5, (Float local8\Field37), "maximumspinepitch"))
                    local8\Field35 = (Int GUESSEDgetbool_3(local5, (Float local8\Field35), "maximumspinepitchdist"))
                    local8\Field19 = (Int GUESSEDgetbool_3(local5, (Float local8\Field19), "maximumheadpitch"))
                    local8\Field20 = (Int GUESSEDgetbool_3(local5, (Float local8\Field20), "fixedspinerotation"))
                    local8\Field34 = GUESSEDgetbool(local5, local8\Field34, "usedefaultrolls")
                    local8\Field13 = GUESSEDgetbool_3(local5, local8\Field13, "collisionradius")
                    local8\Field24 = GUESSEDgetbool_3(local5, local8\Field24, "scale")
                    local8\Field41 = GUESSEDgetarg1(local5, local8\Field41, "stepsound")
                    local8\Field43 = GUESSEDgetbool_3(local5, local8\Field43, "blobshadowsize")
                    local8\Field16 = GUESSEDgetbool_3(local5, local8\Field16, "stamina")
                    local8\Field44 = GUESSEDgetbool_3(local5, local8\Field44, "speed")
                    local8\Field38 = GUESSEDgetbool_3(local5, local8\Field38, "viewoffsety")
                    local8\Field12 = GUESSEDgetbool_3(local5, local8\Field12, "holdingitemoffsetx")
                    local8\Field1 = GUESSEDgetbool_3(local5, local8\Field1, "holdingitemoffsety")
                    local8\Field45 = GUESSEDgetbool_3(local5, local8\Field45, "holdingitemoffsetz")
                    local8\Field57 = GUESSEDgetbool_3(local5, local8\Field57, "holdingitemoffsetpitch")
                    local8\Field32 = GUESSEDgetbool_3(local5, local8\Field32, "holdingitemoffsetyaw")
                    local8\Field50 = GUESSEDgetbool_3(local5, local8\Field50, "holdingitemoffsetroll")
                    local8\Field17 = GUESSEDgetbool_3(local5, local8\Field17, "forearmholdingpitch")
                    local8\Field60 = GUESSEDgetbool_3(local5, local8\Field60, "forearmholdingyaw")
                    local8\Field25 = GUESSEDgetbool_3(local5, local8\Field25, "forearmholdingroll")
                    local8\Field61 = GUESSEDgetbool_3(local5, local8\Field61, "hitboxwidth")
                    local8\Field14 = GUESSEDgetbool_3(local5, local8\Field14, "hitboxheight")
                    local8\Field36 = GUESSEDgetbool_3(local5, local8\Field36, "hitboxdepth")
                    local8\Field49 = GUESSEDgetarg1(local5, local8\Field49, "movesound")
                    local8\Field3 = GUESSEDgetbool(local5, local8\Field3, "disableroll")
                    local8\Field0 = GUESSEDgetbool(local5, local8\Field0, "disablebloodloss")
                    local8\Field33 = GUESSEDgetbool(local5, local8\Field33, "disableinjuries")
                    local8\Field7 = GUESSEDgetbool(local5, local8\Field7, "flippitch")
                    local8\Field55 = GUESSEDgetbool(local5, local8\Field55, "disableinteractitems")
                    local8\Field23 = GUESSEDgetbool_2(local5, local8\Field23, "rotationmode")
                    local8\Field29 = GUESSEDgetbool(local5, local8\Field29, "comparedspinerotation")
                    local8\Field27 = GUESSEDgetbool(local5, local8\Field27, "disablejump")
                    local8\Field46 = GUESSEDgetbool_2(local5, local8\Field46, "material")
                    local8\Field2 = GUESSEDgetbool_2(local5, local8\Field2, "collisiontype")
                    local8\Field28 = GUESSEDgetarg1(local5, local8\Field28, "emitterbones")
                    local8\Field9 = GUESSEDgetbool_2(local5, local8\Field9, "boneemitter")
                    local8\Field11 = GUESSEDgetbool(local5, local8\Field11, "constantinvisibility")
                    local8\Field42 = GUESSEDgetbool_3(local5, local8\Field42, "lightradius")
                    local8\Field39 = GUESSEDgetbool(local5, local8\Field39, "lightshadows")
                    local8\Field15 = (Int GUESSEDgetbool_3(local5, (Float local8\Field15), "lightr"))
                    local8\Field51 = (Int GUESSEDgetbool_3(local5, (Float local8\Field51), "lightg"))
                    local8\Field54 = (Int GUESSEDgetbool_3(local5, (Float local8\Field54), "lightb"))
                    local8\Field59 = GUESSEDgetbool_3(local5, local8\Field59, "lightscattering")
                    local9 = GUESSEDgetbool_2(local5, $00, "copyattaches")
                    If (local9 > $00) Then
                        For local10 = $00 To $1FF Step $01
                            If (GUESSEDcheckvalue_39(local10, local9) <> 0) Then
                                GUESSEDcheckvalue_3(local10, local9, local10, local6)
                            EndIf
                        Next
                    EndIf
                    local11 = _JsonGetValue(local5, "idlesounds")
                    If (_JsonIsArray(local11) <> 0) Then
                        local12 = _JsonGetArray(local11)
                        local13 = _JsonGetArraySize(local12)
                        For local14 = $00 To (local13 - $01) Step $01
                            local15 = _JsonGetArrayValue(local12, local14)
                            If (_JsonIsObject(local15) <> 0) Then
                                local16 = GUESSEDgetbool_2(local15, $00, "id")
                                If (((local16 >= $00) And (local16 < $04)) <> 0) Then
                                    GUESSEDloadsound_2(local6, local16, GUESSEDgetarg1(local15, "", "filename"), GUESSEDgetbool(local15, $00, "selfplay"))
                                Else
                                    Print("ERROR: Player model sound ID must be from 0 to 3")
                                EndIf
                            EndIf
                        Next
                    EndIf
                    local11 = _JsonGetValue(local5, "animations")
                    If (_JsonIsArray(local11) <> 0) Then
                        local12 = _JsonGetArray(local11)
                        local13 = _JsonGetArraySize(local12)
                        For local14 = $00 To (local13 - $01) Step $01
                            local15 = _JsonGetArrayValue(local12, local14)
                            If (_JsonIsObject(local15) <> 0) Then
                                local6 = GUESSEDgetbool_2(local15, $00, "id")
                                If (((local6 > $00) And (local6 <= $40)) <> 0) Then
                                    local8\Field58[local6] = PackTwoValues(GUESSEDgetbool_2(local15, $00, "start"), GUESSEDgetbool_2(local15, $00, "end"))
                                    local8\Field52[local6] = GUESSEDgetbool_3(local15, local8\Field52[local6], "speed")
                                    local8\Field18[local6] = GUESSEDgetbool_3(local15, local8\Field18[local6], "stepaccum")
                                    local8\Field6[local6] = GUESSEDgetarg1(local15, local8\Field6[local6], "bones")
                                    local8\Field5[local6] = GUESSEDgetbool(local15, local8\Field5[local6], "disablespine")
                                Else
                                    Print("ERROR: Player Animations ID must be from 1 to 63")
                                EndIf
                            EndIf
                        Next
                    EndIf
                    local11 = _JsonGetValue(local5, "deadanimations")
                    If (_JsonIsArray(local11) <> 0) Then
                        local12 = _JsonGetArray(local11)
                        local13 = _JsonGetArraySize(local12)
                        For local14 = $00 To (local13 - $01) Step $01
                            local15 = _JsonGetArrayValue(local12, local14)
                            If (_JsonIsObject(local15) <> 0) Then
                                local6 = GUESSEDgetbool_2(local15, $00, "id")
                                If (((local6 >= $00) And (local6 < $08)) <> 0) Then
                                    local8\Field22[local6] = PackTwoValues(GUESSEDgetbool_2(local15, $00, "start"), GUESSEDgetbool_2(local15, $00, "end"))
                                    local8\Field26[local6] = GUESSEDgetbool_3(local15, local8\Field26[local6], "speed")
                                Else
                                    Print("ERROR: Player Dead Animations ID must be from 0 to 7")
                                EndIf
                            EndIf
                        Next
                    EndIf
                Else
                    Print("ERROR: Player models ID must be from 1 to 63")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "playertextures")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (GUESSEDgetarg1(local5, "", "filename") = "") Then
                    Print("ERROR: Filename mustn't be empty")
                ElseIf (((local6 > $00) And (local6 < $80)) <> 0) Then
                    GUESSEDcheckvalue_41(local6, GUESSEDgetarg1(local5, "", "filename"), $00)
                    If (GUESSEDgetarg1(local5, "", "terminatefilename") <> "") Then
                        GUESSEDcheckvalue_22(local6, GUESSEDgetarg1(local5, "", "terminatefilename"))
                    EndIf
                Else
                    Print("ERROR: Player textures ID must be from 1 to 127")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "playerweapontextures")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (GUESSEDgetarg1(local5, "", "filename") = "") Then
                    Print("ERROR: Filename mustn't be empty")
                ElseIf (((local6 > $00) And (local6 < $80)) <> 0) Then
                    GUESSEDcheckvalue_4(local6, GUESSEDgetarg1(local5, "", "filename"), $01)
                Else
                    Print("ERROR: Weapon textures ID must be from 1 to 127")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "attaches")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (((local6 > $00) And (local6 < $200)) <> 0) Then
                    GUESSEDcheckvalue_26(local6, GUESSEDgetarg1(local5, "", "filename"), GUESSEDgetarg1(local5, "", "texture"), GUESSEDgetbool(local5, $00, "rigged"), $01)
                    If (GUESSEDgetbool_2(local5, $00, "variety") > $00) Then
                        GUESSEDscaleentity_6(local6, GUESSEDgetbool_2(local5, $00, "variety"), GUESSEDgetarg1(local5, "", "filename"), GUESSEDgetarg1(local5, "", "texture"))
                    EndIf
                    GUESSEDcheckvalue_34(local6, GUESSEDgetbool_2(local5, $00, "playeranimation"))
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "weapons")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (GUESSEDgetarg1(local5, "", "filename") = "") Then
                    Print("ERROR: Filename mustn't be empty")
                ElseIf (((local6 > $00) And (local6 < $100)) <> 0) Then
                    local17 = GUESSEDgetbool_2(local5, $00, "itemid")
                    local18 = GUESSEDgetarg1(local5, "", "itemname")
                    If (((local17 > $00) And (local18 <> "")) <> 0) Then
                        local19 = createitemtemplate(local18, local18, local17, ("..\..\" + GUESSEDgetarg1(local5, "", "itemworldmodel")), ("..\..\..\" + GUESSEDgetarg1(local5, "", "itemicon")), "", GUESSEDgetbool_3(local5, 0.1, "itemscale"), (Int clamp((Float GUESSEDgetbool_2(local5, $01, "itempicksound")), 0.0, 4.0)), "", "", $00, $01)
                        local19\Field11 = local6
                        local19\Field12 = GUESSEDgetarg1(local5, "", "itemimpactsound")
                    EndIf
                    GUESSEDcreateentity_6(local6, GUESSEDgetarg1(local5, "", "filename"), GUESSEDgetbool_2(local5, $00, "weapontype"), $01)
                    local20 = GUESSEDgetbool_2(local5, X8ZZ6XZBBD[local6]\Field7, "attachid")
                    GUESSEDcallcheckvalue(local6, local20)
                    For local14 = $01 To $3F Step $01
                        GUESSEDcheckvalue_3($1E, local14, local20, local14)
                    Next
                    local21 = GUESSEDcheckvalue_31(local6)
                    local21\Field21 = GUESSEDgetbool_3(local5, local21\Field21, "offsetx")
                    local21\Field31 = GUESSEDgetbool_3(local5, local21\Field31, "offsety")
                    local21\Field53 = GUESSEDgetbool_3(local5, local21\Field53, "offsetz")
                    local21\Field37 = GUESSEDgetbool_3(local5, local21\Field37, "offsetpitch")
                    local21\Field35 = GUESSEDgetbool_3(local5, local21\Field35, "offsetyaw")
                    local21\Field19 = GUESSEDgetbool_3(local5, local21\Field19, "offsetroll")
                    local21\Field47 = GUESSEDgetbool_3(local5, local21\Field47, "scale")
                    local21\Field13 = GUESSEDgetbool_3(local5, local21\Field13, "muzzleflashscale")
                    local21\Field24 = GUESSEDgetbool_3(local5, local21\Field24, "muzzleflashyaw")
                    local21\Field50 = GUESSEDgetbool_3(local5, local21\Field50, "recoil")
                    local21\Field18 = GUESSEDgetbool_3(local5, local21\Field18, "spread")
                    local21\Field32 = (GUESSEDgetbool_3(local5, (local21\Field32 / 70.0), "shootrate") * 70.0)
                    local21\Field57 = GUESSEDgetbool_2(local5, local21\Field57, "recoilseed")
                    local21\Field58 = GUESSEDgetbool_3(local5, local21\Field58, "damage")
                    local21\Field52 = GUESSEDgetbool_2(local5, local21\Field52, "maxammo")
                    local21\Field6 = GUESSEDgetbool_2(local5, local21\Field6, "maxclipammo")
                    local21\Field22 = (GUESSEDgetbool_3(local5, (local21\Field22 / 70.0), "reloadtime") * 70.0)
                    local21\Field51 = GUESSEDgetbool_3(local5, local21\Field51, "shootrange")
                    local21\Field25 = GUESSEDgetarg1(local5, local21\Field25, "shootsound")
                    local21\Field12 = GUESSEDgetarg1(local5, local21\Field12, "reloadsound")
                    local21\Field1 = GUESSEDgetarg1(local5, local21\Field1, "deploysound")
                    local21\Field8 = GUESSEDgetarg1(local5, local21\Field8, "shootstartsound")
                    local21\Field54 = GUESSEDgetarg1(local5, local21\Field54, "misssound")
                    local11 = _JsonGetValue(local5, "hitsounds")
                    If (_JsonIsArray(local11) <> 0) Then
                        local12 = _JsonGetArray(local11)
                        local13 = _JsonGetArraySize(local12)
                        For local14 = $00 To (local13 - $01) Step $01
                            local15 = _JsonGetArrayValue(local12, local14)
                            If (_JsonIsObject(local15) <> 0) Then
                                local6 = GUESSEDgetbool_2(local15, $00, "id")
                                If (((local6 >= $00) And (local6 < $08)) <> 0) Then
                                    local21\Field59[local6] = GUESSEDgetarg1(local15, "", "hitsound")
                                Else
                                    Print("ERROR: Weapons hit sounds ID must be from 0 to 7")
                                EndIf
                            EndIf
                        Next
                    EndIf
                    local21\Field41 = GUESSEDgetbool_3(local5, local21\Field41, "sightoffsetx")
                    local21\Field43 = GUESSEDgetbool_3(local5, local21\Field43, "sightoffsety")
                    local21\Field2 = GUESSEDgetbool_3(local5, local21\Field2, "sightmultiplier")
                    local21\Field26 = GUESSEDgetbool(local5, local21\Field26, "isviewmodel")
                    local21\Field28 = GUESSEDgetbool(local5, local21\Field28, "applyitemtexture")
                    local21\Field9 = GUESSEDgetbool(local5, local21\Field9, "isselectable")
                    local21\Field5 = GUESSEDgetbool(local5, local21\Field5, "notexture")
                    local21\Field40 = GUESSEDgetbool_2(local5, local21\Field40, "handsurface")
                    local21\Field17 = GUESSEDgetbool(local5, local21\Field17, "pump")
                    local21\Field60 = GUESSEDgetbool_2(local5, local21\Field60, "pellets")
                    local21\Field42 = GUESSEDgetbool(local5, local21\Field42, "combat")
                    local21\Field39 = GUESSEDgetbool(local5, local21\Field39, "shootafteranim")
                    local21\Field15 = GUESSEDgetbool_2(local5, local21\Field15, "playeranimation")
                    local21\Field10 = GUESSEDgetarg1(local5, local21\Field10, "shellbone")
                    local21\Field48 = GUESSEDgetarg1(local5, local21\Field48, "shellmodel")
                    local21\Field33 = GUESSEDgetarg1(local5, local21\Field33, "shellactionsound")
                    local21\Field55 = GUESSEDgetarg1(local5, local21\Field55, "shellcollisionsound")
                    local21\Field23 = GUESSEDgetarg1(local5, local21\Field23, "shellsound")
                    local21\Field61 = GUESSEDgetarg1(local5, local21\Field61, "shellexplosion")
                    local21\Field7 = (Float GUESSEDgetbool_2(local5, (Int local21\Field7), "shelltimeout"))
                    local21\Field36 = GUESSEDgetbool_3(local5, local21\Field36, "shellspeed")
                    local21\Field44 = GUESSEDgetbool_3(local5, local21\Field44, "shellradius")
                    local21\Field16 = GUESSEDgetbool_3(local5, local21\Field16, "shellscale")
                    local21\Field49 = GUESSEDgetbool_3(local5, local21\Field49, "shellimpacttime")
                    local21\Field14 = GUESSEDgetbool_3(local5, local21\Field14, "shellgravity")
                    local21\Field4 = GUESSEDgetbool_3(local5, local21\Field4, "shellrestitution")
                    local21\Field3 = GUESSEDgetbool_2(local5, local21\Field3, "shellemitter")
                    local21\Field0 = GUESSEDgetarg1(local5, local21\Field0, "shellactionemitter")
                    local21\Field29 = GUESSEDgetbool_3(local5, local21\Field29, "shellforce")
                    local21\Field46 = GUESSEDgetbool(local5, local21\Field46, "shellphysical")
                    local21\Field27 = GUESSEDgetbool(local5, local21\Field27, "shellsticky")
                    local21\Field62 = GUESSEDgetbool_2(local5, local21\Field62, "shellaction")
                    local21\Field38 = GUESSEDgetbool_3(local5, local21\Field38, "shellactionradius")
                    local11 = _JsonGetValue(local5, "animations")
                    If (_JsonIsArray(local11) <> 0) Then
                        local12 = _JsonGetArray(local11)
                        local13 = _JsonGetArraySize(local12)
                        For local14 = $00 To (local13 - $01) Step $01
                            local15 = _JsonGetArrayValue(local12, local14)
                            If (_JsonIsObject(local15) <> 0) Then
                                local6 = GUESSEDgetbool_2(local15, $00, "id")
                                If (((local6 > $00) And (local6 < $09)) <> 0) Then
                                    local21\Field20[local6] = PackTwoValues(GUESSEDgetbool_2(local15, $00, "start"), GUESSEDgetbool_2(local15, $00, "end"))
                                    local21\Field34[local6] = GUESSEDgetbool_3(local15, local21\Field34[local6], "speed")
                                Else
                                    Print("ERROR: Weapons Animations ID must be from 1 to 8")
                                EndIf
                            EndIf
                        Next
                    EndIf
                Else
                    Print("ERROR: Weapons ID must be from 1 to 255")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "attaches")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (((local6 > $00) And (local6 < $200)) <> 0) Then
                    local11 = _JsonGetValue(local5, "presets")
                    If (_JsonIsArray(local11) <> 0) Then
                        local12 = _JsonGetArray(local11)
                        local13 = _JsonGetArraySize(local12)
                        For local14 = $00 To (local13 - $01) Step $01
                            local15 = _JsonGetArrayValue(local12, local14)
                            If (_JsonIsObject(local15) <> 0) Then
                                local22 = GUESSEDgetbool_2(local15, $00, "id")
                                If (((local22 > $00) And (local22 < $40)) <> 0) Then
                                    local23 = GUESSEDcheckvalue_32(local6, local22)
                                    If (local23 <> Null) Then
                                        local23\Field5 = GUESSEDgetarg1(local15, local23\Field5, "bone")
                                        local23\Field0 = GUESSEDgetbool_3(local15, local23\Field0, "offsetx")
                                        local23\Field2 = GUESSEDgetbool_3(local15, local23\Field2, "offsety")
                                        local23\Field1 = GUESSEDgetbool_3(local15, local23\Field1, "offsetz")
                                        local23\Field8 = GUESSEDgetbool_3(local15, local23\Field8, "offsetpitch")
                                        local23\Field4 = GUESSEDgetbool_3(local15, local23\Field4, "offsetyaw")
                                        local23\Field3 = GUESSEDgetbool_3(local15, local23\Field3, "offsetroll")
                                        local23\Field7 = GUESSEDgetbool_3(local15, local23\Field7, "scale")
                                        local23\Field6 = GUESSEDgetbool_2(local15, local23\Field6, "variety")
                                        local11 = _JsonGetValue(local5, "sounds")
                                        If (_JsonIsArray(local11) <> 0) Then
                                            local12 = _JsonGetArray(local11)
                                            local13 = _JsonGetArraySize(local12)
                                            For local24 = $00 To (local13 - $01) Step $01
                                                local15 = _JsonGetArrayValue(local12, local24)
                                                If (_JsonIsObject(local15) <> 0) Then
                                                    local16 = GUESSEDgetbool_2(local15, $00, "id")
                                                    If (((local16 > $00) And (local16 < $04)) <> 0) Then
                                                        GUESSEDloadsound(local6, local16, GUESSEDgetarg1(local15, "0", "filename"))
                                                    Else
                                                        Print("ERROR: Attach sound ID must be from 0 to 3")
                                                    EndIf
                                                EndIf
                                            Next
                                        EndIf
                                    Else
                                        Print("ERROR: Unable to create attach preset for non-created attach")
                                    EndIf
                                EndIf
                            EndIf
                        Next
                    EndIf
                Else
                    Print("ERROR: Attaches ID must be from 1 to 511")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "playermodels")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (((local6 > $00) And (local6 < $40)) <> 0) Then
                    local9 = GUESSEDgetbool_2(local5, $00, "copyattaches")
                    If (local9 > $00) Then
                        For local10 = $00 To $1FF Step $01
                            If (GUESSEDcheckvalue_39(local10, local9) <> 0) Then
                                GUESSEDcheckvalue_3(local10, local9, local10, local6)
                            EndIf
                        Next
                    EndIf
                Else
                    Print("ERROR: Player models ID must be from 1 to 63")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "items")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (GUESSEDgetarg1(local5, "", "worldmodel") = "") Then
                    Print("ERROR: Filename mustn't be empty")
                ElseIf (local6 > $00) Then
                    local19 = createitemtemplate(GUESSEDgetarg1(local5, "", "name"), GUESSEDgetarg1(local5, "", "name"), local6, ("..\..\" + GUESSEDgetarg1(local5, "", "worldmodel")), ("..\..\..\" + GUESSEDgetarg1(local5, "", "icon")), "", GUESSEDgetbool_3(local5, 0.1, "scale"), (Int clamp((Float GUESSEDgetbool_2(local5, $01, "picksound")), 0.0, 4.0)), "", "", $00, $01)
                    local19\Field11 = GUESSEDgetbool_2(local5, $00, "weapon")
                    local19\Field12 = GUESSEDgetarg1(local5, "", "impactsound")
                    local25 = GUESSEDgetarg1(local5, "255 255 255", "color")
                    entitycolor(local19\Field21, (Float _SplitString(local25, " ", $00)), (Float _SplitString(local25, " ", $01)), (Float _SplitString(local25, " ", $02)))
                Else
                    Print("ERROR: Items ID must be from 1")
                EndIf
            EndIf
        Next
    EndIf
    For local26 = Each itemtemplates
        If (local26\Field22 <> $00) Then
            If (local26\Field13 <> "") Then
                For local27 = Each itemtemplates
                    If (((local27 <> local26) And (local27\Field22 = local26\Field22)) <> 0) Then
                        deletesingletextureentryfromcache(local27\Field22, $00)
                        local27\Field22 = $00
                    EndIf
                Next
            EndIf
            deletesingletextureentryfromcache(local26\Field22, $00)
            local26\Field22 = $00
        EndIf
    Next
    local1 = _JsonGetValue(local0, "objects")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (GUESSEDgetarg1(local5, "", "filename") = "") Then
                    Print("ERROR: Filename mustn't be empty")
                ElseIf (((local6 > $00) And (local6 < $3E8)) <> 0) Then
                    GUESSEDloadfiletype_2(local6, GUESSEDgetarg1(local5, "", "filename"))
                Else
                    Print("ERROR: Object ID must be from 1 to 999")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "textures")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (GUESSEDgetarg1(local5, "", "filename") = "") Then
                    Print("ERROR: Filename mustn't be empty")
                ElseIf (((local6 > $00) And (local6 < $3E8)) <> 0) Then
                    GUESSEDloadfiletype_2(local6, GUESSEDgetarg1(local5, "", "filename"))
                Else
                    Print("ERROR: Textures ID must be from 1 to 999")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "fonts")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $00, "id")
                If (local6 >= $10) Then
                    If (XD00026ZX2\Field0[local6] <> $00) Then
                        freefont(XD00026ZX2\Field0[local6])
                    EndIf
                    arg0 = GUESSEDgetarg1(local5, "", "filename")
                    If (GUESSEDisfileinlang(arg0) <> 0) Then
                        XD00026ZX2\Field0[local6] = loadfont_strict(arg0, (Int clamp(GUESSEDgetbool_3(local5, 16.0, "size"), 1.0, 128.0)), $00)
                    Else
                        GUESSEDsetred(("Unable to load font: " + arg0))
                    EndIf
                Else
                    Print("ERROR: Font ID must be from 16 to 23")
                EndIf
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "spritefonts")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                GUESSEDloadfont(GUESSEDgetarg1(local5, "", "name"), GUESSEDgetarg1(local5, "", "filename"), 64.0, 1.0)
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "lights")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local28 = lower(GUESSEDgetarg1(local5, " ", "roomname"))
                local29 = (New templights)
                For local30 = Each roomtemplates
                    If (local30\Field12 = local28) Then
                        local29\Field7 = local30
                        Exit
                    EndIf
                Next
                local29\Field11 = (GUESSEDgetbool_3(local5, 999999.0, "x") * (1.0 / 256.0))
                local29\Field8 = (GUESSEDgetbool_3(local5, 999999.0, "y") * (1.0 / 256.0))
                local29\Field4 = (GUESSEDgetbool_3(local5, 999999.0, "z") * (1.0 / 256.0))
                local29\Field9 = GUESSEDgetbool_2(local5, $02, "type")
                local29\Field1 = GUESSEDgetbool_3(local5, 0.0, "range")
                local29\Field2 = GUESSEDgetbool_2(local5, $FF, "r")
                local29\Field3 = GUESSEDgetbool_2(local5, $FF, "g")
                local29\Field14 = GUESSEDgetbool_2(local5, $FF, "b")
                local29\Field0 = GUESSEDgetbool(local5, $00, "castshadows")
                local29\Field6 = GUESSEDgetbool_3(local5, 0.0, "scattering")
                local29\Field15 = GUESSEDgetbool_3(local5, 0.0, "pitch")
                local29\Field10 = GUESSEDgetbool_3(local5, 0.0, "yaw")
                local29\Field16 = GUESSEDgetbool_3(local5, 90.0, "coneangle")
            EndIf
        Next
    EndIf
    local1 = _JsonGetValue(local0, "emitters")
    If (_JsonIsArray(local1) <> 0) Then
        local2 = _JsonGetArray(local1)
        local3 = _JsonGetArraySize(local2)
        For local4 = $00 To (local3 - $01) Step $01
            local5 = _JsonGetArrayValue(local2, local4)
            If (_JsonIsObject(local5) <> 0) Then
                local6 = GUESSEDgetbool_2(local5, $FFFFFFFF, "id")
                If (((local6 >= $00) And (local6 < $FF)) <> 0) Then
                    If (particleeffect[local6] = $00) Then
                        particleeffect[local6] = createtemplate()
                    EndIf
                    local31 = (Object.template particleeffect[local6])
                    If (local31 <> Null) Then
                        local31\Field48 = GUESSEDgetbool_2(local5, local31\Field48, "blend")
                        local31\Field42 = GUESSEDgetbool_2(local5, local31\Field42, "fx")
                        local31\Field3 = GUESSEDgetbool_2(local5, local31\Field3, "interval")
                        local31\Field17 = GUESSEDgetbool_2(local5, local31\Field17, "particlesperinterval")
                        If (local31\Field17 <= $00) Then
                            local31\Field17 = $01
                        EndIf
                        If (local31\Field17 > $64) Then
                            local31\Field17 = $64
                        EndIf
                        local32 = GUESSEDgetbool_2(local5, local31\Field37, "maxparticles")
                        If (((local32 <= $00) Or (local32 > $7D0)) <> 0) Then
                            local32 = $1F4
                        EndIf
                        local31\Field37 = local32
                        local33 = GUESSEDgetbool_2(local5, local31\Field4, "emitterlifetime")
                        If (local33 <= $00) Then
                            local33 = $12C
                        EndIf
                        If (local33 > $8CA0) Then
                            local33 = $8CA0
                        EndIf
                        local31\Field4 = local33
                        local31\Field2 = GUESSEDgetbool_2(local5, local31\Field2, "mintime")
                        If (local31\Field2 < $00) Then
                            local31\Field2 = $00
                        EndIf
                        local34 = GUESSEDgetbool_2(local5, local31\Field1, "maxtime")
                        If (((local34 <= $00) Or (local34 > $4B0)) <> 0) Then
                            local34 = $12C
                        EndIf
                        local31\Field1 = local34
                        local35 = ""
                        If (local31\Field15 <> $00) Then
                            local35 = lower(texturename(local31\Field15))
                        EndIf
                        local36 = lower(GUESSEDgetarg1(local5, local35, "texture"))
                        If ((((local36 <> local35) And (local36 <> "")) And GUESSEDcallfiletype_2(local36)) <> 0) Then
                            local31\Field15 = loadtexture_strict(local36, $03, $00, 1.0)
                        EndIf
                        local31\Field27 = GUESSEDgetbool(local5, local31\Field27, "animtex")
                        local31\Field34 = GUESSEDgetbool_2(local5, local31\Field34, "maxframes")
                        local31\Field8 = GUESSEDgetbool_3(local5, local31\Field8, "texspeed")
                        local31\Field12 = GUESSEDgetbool_3(local5, local31\Field12, "minox")
                        local31\Field41 = GUESSEDgetbool_3(local5, local31\Field41, "maxox")
                        local31\Field6 = GUESSEDgetbool_3(local5, local31\Field6, "minoy")
                        local31\Field36 = GUESSEDgetbool_3(local5, local31\Field36, "maxoy")
                        local31\Field47 = GUESSEDgetbool_3(local5, local31\Field47, "minoz")
                        local31\Field14 = GUESSEDgetbool_3(local5, local31\Field14, "maxoz")
                        local31\Field10 = GUESSEDgetbool_3(local5, local31\Field10, "minxv")
                        local31\Field46 = GUESSEDgetbool_3(local5, local31\Field46, "maxxv")
                        local31\Field21 = GUESSEDgetbool_3(local5, local31\Field21, "minyv")
                        local31\Field45 = GUESSEDgetbool_3(local5, local31\Field45, "maxyv")
                        local31\Field9 = GUESSEDgetbool_3(local5, local31\Field9, "minzv")
                        local31\Field5 = GUESSEDgetbool_3(local5, local31\Field5, "maxzv")
                        local31\Field19 = GUESSEDgetbool_3(local5, local31\Field19, "rotvel1")
                        local31\Field11 = GUESSEDgetbool_3(local5, local31\Field11, "rotvel2")
                        local31\Field40 = GUESSEDgetbool(local5, local31\Field40, "aligntofall")
                        local31\Field38 = GUESSEDgetbool_2(local5, local31\Field38, "aligntofalloffset")
                        local31\Field49 = GUESSEDgetbool_3(local5, local31\Field49, "gravity")
                        local31\Field0 = GUESSEDgetbool_3(local5, local31\Field0, "floory")
                        local31\Field29 = GUESSEDgetbool_3(local5, local31\Field29, "floorbounce")
                        local31\Field26 = GUESSEDgetbool_2(local5, local31\Field26, "floorup")
                        local31\Field43 = GUESSEDgetbool_3(local5, local31\Field43, "alpha")
                        local31\Field7 = GUESSEDgetbool(local5, local31\Field7, "alphavel")
                        local31\Field44 = GUESSEDgetbool_3(local5, local31\Field44, "sx")
                        local31\Field16 = GUESSEDgetbool_3(local5, local31\Field16, "sy")
                        local31\Field31 = GUESSEDgetbool_3(local5, local31\Field31, "sizemultiplicator1")
                        local31\Field24 = GUESSEDgetbool_3(local5, local31\Field24, "sizemultiplicator2")
                        local31\Field30 = GUESSEDgetbool_3(local5, local31\Field30, "sizeadd")
                        local31\Field33 = GUESSEDgetbool_3(local5, local31\Field33, "sizemult")
                        local31\Field32 = GUESSEDgetbool_2(local5, local31\Field32, "brightness")
                        local37 = (((local31\Field39 Shl $10) + (local31\Field25 Shl $08)) + local31\Field23)
                        local38 = (((local31\Field20 Shl $10) + (local31\Field13 Shl $08)) + local31\Field22)
                        local39 = GUESSEDgetbool_2(local5, local37, "color1")
                        local40 = GUESSEDgetbool_2(local5, local38, "color2")
                        settemplatecolors(particleeffect[local6], local39, local40)
                        local31\Field28 = GUESSEDgetbool_2(local5, local31\Field28, "pitchfix")
                        local31\Field35 = GUESSEDgetbool_2(local5, local31\Field35, "yawfix")
                    EndIf
                Else
                    Print("ERROR: Emitter ID must be from 0 to 254")
                EndIf
            EndIf
        Next
    EndIf
    Print((("Loaded " + arg0) + " successfully"))
    _JsonFreeDocument(local0)
    Return $00
End Function
