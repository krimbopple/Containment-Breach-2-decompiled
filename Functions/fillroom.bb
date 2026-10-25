Function fillroom%(arg0.rooms)
    Local local0.doors
    Local local1.doors
    Local local2.securitycams
    Local local3.decals
    Local local4.rooms
    Local local5.forest
    Local local6.emitter
    Local local7.items
    Local local8.items
    Local local9%
    Local local10%
    Local local11.lights
    Local local12#
    Local local13#
    Local local14#
    Local local15%
    Local local16%
    Local local17%
    Local local18%
    Local local19%
    Local local20$
    Local local21%
    Local local22%
    Local local23%
    Local local24#
    Local local25%
    Local local26%
    Local local27%
    Local local28%
    Local local29#
    Local local30$
    Local local31%
    Local local32#
    Local local33#
    Local local38%
    Local local39#
    Local local40#
    Local local41%
    Local local51%
    Local local54%
    Local local56.tempscreens
    Local local57.tempwaypoints
    Local local58.templights
    Local local59.tempprops
    Local local60.tempsoundemitters
    Local local61.TFFD0Z88DZ
    If (GUESSEDisnewgameorupdate() <> 0) Then
        Return MP_FillRoom(arg0)
    EndIf
    catcherrors("FillRoom()")
    Select arg0\Field22\Field21
        Case $00
            createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 2.0), 0.0, $00, $00, $03, $00, $00)
            createdoor(arg0, (arg0\Field40 - 0.875), arg0\Field3, (arg0\Field37 - 3.0), 90.0, $00, $00, $03, $00, $00)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.0), (arg0\Field3 + 1.5), (arg0\Field37 + 2.5), 20.0, $01, (arg0\Field40 - 1.667969), (arg0\Field3 + 0.921875), (arg0\Field37 - 2.24375), 0.0, 0.0, 0.0)
            showentity(local2\Field0)
            showentity(local2\Field7)
            local2\Field20 = 180.0
            local2\Field8 = 45.0
            If (rand($03, $01) = $01) Then
                local2\Field1 = rand($2BC, $01)
            EndIf
            arg0\Field27[$00] = loadmesh_strict("GFX\Map\Props\watches.b3d", $00, $01)
            local24 = (1.0 / 6.4)
            scaleentity(arg0\Field27[$00], local24, local24, local24, $00)
            rotateentity(arg0\Field27[$00], 0.0, 128.0, 0.0, $00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 2.574219), (arg0\Field3 + (1.0 / 1.924812)), (arg0\Field37 + (1.0 / 1.236715)), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = loadmesh_strict("GFX\NPCs\rubber_duck.b3d", $00, $01)
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            rotateentity(arg0\Field27[$01], 0.0, 260.0, 0.0, $00)
            positionentity(arg0\Field27[$01], (arg0\Field40 - 2.574219), (arg0\Field3 + (1.0 / 1.924812)), (arg0\Field37 + 1.742188), $00)
            entityradius(arg0\Field27[$01], 0.2, 0.0)
            entitypickmode(arg0\Field27[$01], $01, $01)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = loadanimmesh_strict("GFX\Map\Props\penny.b3d", $00, $01)
            scaleentity(arg0\Field27[$02], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$02], (arg0\Field40 - 2.402344), (arg0\Field3 + (1.0 / 1.924812)), (arg0\Field37 - (1.0 / 1.753425)), $00)
            entityradius(arg0\Field27[$02], 0.2, 0.0)
            entitypickmode(arg0\Field27[$02], $01, $01)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            local12 = (arg0\Field40 + 0.75)
            local7 = createitem("Log of Anomalous Items", $00, local12, (arg0\Field3 + 0.375), (arg0\Field37 + 1.800781), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("S-NAV Navigator", $49, local12, (arg0\Field3 + 0.375), (arg0\Field37 - 0.875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Playing Card", $63, local12, (arg0\Field3 + 1.125), (arg0\Field37 + 1.679688), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery(local12, (arg0\Field3 + 0.75), (arg0\Field37 - 1.015625))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Clipboard", $2D, local12, (arg0\Field3 + 0.75), (arg0\Field37 + (1.0 / 2.327273)), $00, $00, $00, 1.0, $00)
            local7\Field20 = local7\Field6\Field14
            setanimtime(local7\Field5, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local8 = createitem("Document SCP-966", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
            local8\Field18 = local7\Field27
            local8\Field17 = $00
            local8\Field30 = $FFFFFFFF
            local7\Field8[$00] = local8
            hideentity(local8\Field9)
            local8 = createitem("Document SCP-1025", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
            local8\Field18 = local7\Field27
            local8\Field17 = $00
            local8\Field30 = $FFFFFFFF
            local7\Field8[$01] = local8
            hideentity(local8\Field9)
            local8 = createitem("Document SCP-085", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
            local8\Field18 = local7\Field27
            local8\Field17 = $01
            local8\Field30 = $FFFFFFFF
            local7\Field8[$02] = local8
            hideentity(local8\Field9)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 3.0))
        Case $01
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 3.070312), arg0\Field3, $00, $03, $00, $00, $00)
            local0\Field47 = $00
            local0\Field41 = $01
            local0\Field21 = $01
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$00] = local0
            GUESSEDcreateentity_14(arg0, arg0\Field40, (arg0\Field3 + 2.378906), (arg0\Field37 + 2.460938), (1.0 / 0.256), $FF, $32, $32, 0.0, 90.0, 0.0, 5.0, 50.0, 0.8, $01)
        Case $29
            GUESSEDcreateentity_14(arg0, arg0\Field40, (arg0\Field3 + 2.378906), (arg0\Field37 + (1.0 / 2.031746)), 2.34375, $FF, $32, $32, 0.0, 90.0, 0.0, 5.0, 50.0, 0.6, $01)
        Case $4F
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 4.695312), arg0\Field3, $00, $03, $00, $00, $00)
            local0\Field47 = $00
            local0\Field41 = $01
            local0\Field21 = $01
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            local0 = createdoor(arg0, (arg0\Field40 - 3.6875), (arg0\Field3 + 1.25), (arg0\Field37 + 3.609375), 180.0, $00, $00, $00, $00, $00)
            local0\Field47 = $00
            local0\Field41 = $01
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$00] = local0
            GUESSEDcreateentity_14(arg0, arg0\Field40, (arg0\Field3 + 2.378906), (arg0\Field37 + 4.113281), (1.0 / 0.256), $FF, $32, $32, 0.0, 90.0, 0.0, 5.0, 50.0, 0.8, $01)
        Case $02
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 2.5), 0.0, (i_005\Field0 = $02), $00, $06, $00, $00)
            arg0\Field25[$00] = local0
            local2 = createsecuritycam(arg0, arg0\Field40, (arg0\Field3 + 1.621094), (arg0\Field37 + 1.65625), 30.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 180.0
            local2\Field8 = 30.0
            local7 = createitem("Document SCP-005", $00, (arg0\Field40 + 1.96875), (arg0\Field3 + 0.59375), (arg0\Field37 - (1.0 / 0.512)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (i_005\Field0 = $01) Then
                local7 = createitem("SCP-005", $06, arg0\Field40, (arg0\Field3 + (1.0 / 1.137778)), (arg0\Field37 + (1.0 / 1.07563)), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
                affectdecaydoor(arg0\Field25[$00])
                local3 = createdecal($00, (arg0\Field40 - 1.414062), (arg0\Field3 + 0.005), (arg0\Field37 - 1.640625), 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
                entityparent(local3\Field0, arg0\Field15, $01)
            ElseIf (i_005\Field0 = $03) Then
                local7 = createitem("Note from Maynard", $00, arg0\Field40, (arg0\Field3 + (1.0 / 1.137778)), (arg0\Field37 + (1.0 / 1.07563)), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 3.242188))
        Case $03
            local0 = createdoor(arg0, (arg0\Field40 - 2.5), (arg0\Field3 + 1.5), (arg0\Field37 + 8.371094), -90.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 12.74219), 180.0, $01, $00, $05, $00, $00)
            createdoor(arg0, (arg0\Field40 + 8.5), (arg0\Field3 + 3.0), (arg0\Field37 + 16.24219), 90.0, $01, $00, $05, $00, $00)
            createdoor(arg0, (arg0\Field40 + 8.3125), (arg0\Field3 + 1.5), (arg0\Field37 + 6.367188), 0.0, $01, $00, $02, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 + 1.0625), arg0\Field3, arg0\Field37, 90.0, $00, $04, $FFFFFFFB, $00, $00)
            local0\Field21 = $01
            local0 = createdoor(arg0, (arg0\Field40 + 15.625), (arg0\Field3 + 1.5), (arg0\Field37 + 14.74219), 90.0, $01, $03, $00, $00, $00)
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 10.5625), (arg0\Field3 + 1.5), (arg0\Field37 + 10.55469), 90.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 5.4375), (arg0\Field3 + 1.5), (arg0\Field37 + 8.371094), 90.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 4.0), 0.0, $01, $00, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 4.554688), (arg0\Field3 + 1.5), (arg0\Field37 + 9.324219), 180.0, $01, $07, $00, $00, $00)
            local0\Field47 = $00
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.048), $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.048), $01)
            arg0\Field25[$04] = local0
            arg0\Field27[$00] = loadmesh_strict("GFX\Map\Props\table_a.b3d", $00, $01)
            scaleentity(arg0\Field27[$00], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            rotateentity(arg0\Field27[$00], 90.0, 45.0, 0.0, $00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 1.0625), (arg0\Field3 + (1.0 / 25.6)), (arg0\Field37 + 8.804688), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = loadmesh_strict("GFX\Map\Props\cabinet_c.b3d", $00, $01)
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            rotateentity(arg0\Field27[$01], 0.0, 225.0, 90.0, $00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 1.75), (arg0\Field3 + (1.0 / 25.6)), (arg0\Field37 + 8.398438), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = loadmesh_strict("GFX\Map\Props\ventilation_grate.b3d", $00, $01)
            scaleentity(arg0\Field27[$02], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            entitytype(arg0\Field27[$02], $01, $00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 11.5), (arg0\Field3 + 4.5), (arg0\Field37 + 10.24219), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 2.015625), (arg0\Field3 + 1.375), (arg0\Field37 + 8.371094), 20.0, $01, (arg0\Field40 + 5.679688), (arg0\Field3 + 2.375), (arg0\Field37 + 9.617188), 0.0, 90.0, 0.0)
            showentity(local2\Field0)
            showentity(local2\Field7)
            local2\Field20 = 270.0
            local2\Field8 = 45.0
            local3 = createdecal($00, (arg0\Field40 + 1.0625), (arg0\Field3 + 0.005), (arg0\Field37 + 9.023438), 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($00, (arg0\Field40 + 1.78125), (arg0\Field3 + 0.005), (arg0\Field37 + 8.527344), 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            For local25 = $00 To $04 Step $01
                Select local25
                    Case $00
                        local12 = 4299.0
                        local14 = 3316.0
                        local27 = $04
                    Case $01
                        local12 = 5184.0
                        local14 = 4302.0
                        local27 = $04
                    Case $02
                        local12 = 5216.0
                        local14 = 3310.0
                        local27 = $04
                    Case $03
                        local12 = 4314.0
                        local14 = 4033.0
                        local27 = $04
                    Case $04
                        local12 = 4972.0
                        local14 = 4017.0
                        local27 = $06
                End Select
                local3 = createdecal(local27, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + 1.507812), (arg0\Field37 + (local14 * (1.0 / 256.0))), 90.0, 45.0, 0.0, ((((Float (local25 = $00)) * 0.44) + ((Float (local25 = $01)) * 1.2)) + ((Float (local25 > $01)) * 0.54)), rnd(0.8, 1.0), $00, $01, $00, $00, $00)
                entityparent(local3\Field0, arg0\Field15, $01)
            Next
            If (_S2IMapContains(unlockedachievements, "keter") <> 0) Then
                createscreen(arg0, (arg0\Field40 + 1.652344), (arg0\Field3 + 1.007812), (arg0\Field37 - 1.113281), 0.0, 0.0, 0.0, (1.0 / 286.899), (1.0 / 370.2097), (1.0 / 256.0), "screen_keter.png")
            EndIf
            If (_S2IMapContains(unlockedachievements, "apollyon") <> 0) Then
                createscreen(arg0, (arg0\Field40 + 2.410156), (arg0\Field3 + 1.007812), (arg0\Field37 - 1.113281), 0.0, 0.0, 0.0, (1.0 / 286.899), (1.0 / 370.2097), (1.0 / 256.0), "screen_apollyon.png")
            EndIf
            local7 = createitem("Document SCP-173", $00, (arg0\Field40 + 3.277539), (arg0\Field3 + (1.0 / 1.479769)), (arg0\Field37 + 9.683946), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Warning Labels #1", $00, (arg0\Field40 + 5.171875), (arg0\Field3 + (1.0 / 1.706667)), (arg0\Field37 + 5.351562), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Emergency Evacuation Shelters", $00, (arg0\Field40 + (1.0 / 3.011765)), (arg0\Field3 + 0.9375), (arg0\Field37 + 14.89844), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Security Clearance Levels", $00, (arg0\Field40 + 4.929688), (arg0\Field3 + 0.625), (arg0\Field37 + 14.375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Note From Bryan", $00, (arg0\Field40 + 6.414062), (arg0\Field3 + 2.148438), (arg0\Field37 + 5.203125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + 7.226562), (arg0\Field3 + 1.972656), (arg0\Field37 + 4.246094), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (rand($03, $01) = $01) Then
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + 7.5), (arg0\Field3 + 1.972656), (arg0\Field37 + 4.246094), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local7 = createitem("Compact First Aid Kit", $36, (arg0\Field40 + 2.632812), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 + (1.0 / 1.376344)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (key2_spawnrate = $01) Then
                Select rand($04, $01)
                    Case $01
                        local12 = 2255.0
                        local13 = 1015.0
                        local14 = 4618.0
                    Case $02
                        local12 = 339.0
                        local13 = 150.0
                        local14 = 2630.0
                    Case $03
                        local12 = 410.0
                        local13 = 150.0
                        local14 = 1120.0
                    Case $04
                        local12 = -124.0
                        local13 = 250.0
                        local14 = 3810.0
                End Select
                local7 = createitem("White Key", $68, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + (local13 * (1.0 / 256.0))), (arg0\Field37 + (local14 * (1.0 / 256.0))), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (snavunlocked <> 0) Then
                local7 = createitem("S-NAV Navigator Ultimate", $4C, (arg0\Field40 + 1.59375), (arg0\Field3 + (1.0 / 1.706667)), (arg0\Field37 - (1.0 / 1.080169)), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (ereaderunlocked <> 0) Then
                local7 = createitem("E-Reader Ultimate", $4F, (arg0\Field40 + 1.453125), (arg0\Field3 + (1.0 / 1.024)), (arg0\Field37 + (1.0 / 1.089362)), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local6 = setemitter(arg0, (arg0\Field40 + 13.16406), (arg0\Field3 + 2.03125), (arg0\Field37 + 17.85156), $07)
            local6\Field7 = $02
        Case $04
            local0 = createdoor(arg0, (arg0\Field40 - 22.5), arg0\Field3, (arg0\Field37 + 4.75), 180.0, $00, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 22.5), arg0\Field3, (arg0\Field37 + 1.25), 0.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 31.5), arg0\Field3, (arg0\Field37 + 4.75), 180.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 34.125), arg0\Field3, (arg0\Field37 + 3.0), 270.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 13.375), (arg0\Field3 - 1.5), (arg0\Field37 - 9.246094), 0.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 5.0625), arg0\Field3, (arg0\Field37 - 6.878906), 0.0, $00, $00, $02, $00, $00)
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 32.875), arg0\Field3, (arg0\Field37 - 4.875), 270.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 31.5), arg0\Field3, (arg0\Field37 + 1.25), 0.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 25.375), arg0\Field3, (arg0\Field37 - 4.875), 90.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 15.875), arg0\Field3, (arg0\Field37 - 4.875), 90.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 8.820312), arg0\Field3, (arg0\Field37 - 3.921875), 180.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.048), $01)
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 + 2.25), arg0\Field3, (arg0\Field37 + 1.496094), 90.0, $00, $03, $00, $00, $00)
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 2.8125), arg0\Field3, (arg0\Field37 - 2.691406), 90.0, $00, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 7.9375), arg0\Field3, (arg0\Field37 - 4.875), 90.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 16.0), arg0\Field3, (arg0\Field37 + 2.0), 0.0, $00, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            local22 = loadtexture_strict("GFX\Map\Textures\Door02.png", $01, $00, 1.0)
            entitytexture(local0\Field0, local22, $00, $00)
            deletesingletextureentryfromcache(local22, $00)
            local22 = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            entityinstance(local0\Field0, $00)
            GUESSEDfreeentity_7(local0\Field0, $FFFFFFFF, $00)
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$04] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 13.375), (arg0\Field3 - 1.5), (arg0\Field37 - (1.0 / 1.984496)), 0.0, $01, $00, $05, $00, $00)
            local0\Field47 = $00
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            arg0\Field25[$05] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 4.875), (arg0\Field3 + 1.5), (arg0\Field37 + 2.996094), 90.0, $00, $00, $05, $00, $00)
            local0\Field47 = $00
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            arg0\Field25[$06] = local0
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 3.703125), (arg0\Field3 + 0.3), (arg0\Field37 + 2.054688), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 3.828125), (arg0\Field3 + 0.3), (arg0\Field37 + 1.25), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 6.875), (arg0\Field3 + 0.4), (arg0\Field37 + 3.5625), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = loadrmesh("GFX\Map\cont1_173_intro_player_cell.rmesh", Null, $01)
            scaleentity(arg0\Field27[$03], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$03], arg0\Field40, arg0\Field3, arg0\Field37, $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = loadrmesh("GFX\Map\cont1_173_intro_cells.rmesh", Null, $00)
            scaleentity(arg0\Field27[$04], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$04], arg0\Field40, arg0\Field3, arg0\Field37, $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            hideentity(arg0\Field27[$04])
            For local25 = $00 To $04 Step $01
                Select local25
                    Case $00
                        local12 = 875.0
                        local14 = -70.0
                        local27 = $04
                    Case $01
                        local12 = 1760.0
                        local14 = 912.0
                        local27 = $04
                    Case $02
                        local12 = 1792.0
                        local14 = -80.0
                        local27 = $04
                    Case $03
                        local12 = 890.0
                        local14 = 642.0
                        local27 = $04
                    Case $04
                        local12 = 1548.0
                        local14 = 627.0
                        local27 = $06
                End Select
                local3 = createdecal(local27, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + (1.0 / 128.0)), (arg0\Field37 + (local14 * (1.0 / 256.0))), 90.0, 45.0, 0.0, ((((Float (local25 = $00)) * 0.44) + ((Float (local25 = $01)) * 1.2)) + ((Float (local25 > $01)) * 0.54)), rnd(0.8, 1.0), $00, $01, $00, $00, $00)
            Next
            local3 = createdecal($16, (arg0\Field40 - 19.77344), ((arg0\Field3 - 4.253906) + 0.05), (arg0\Field37 - 14.11719), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.5, 0.7), 1.0, $00, $01, $00, $00, $00)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 15.39062), (arg0\Field3 - 0.125), (arg0\Field37 - 4.875), 20.0, $01, (arg0\Field40 - 7.695312), (arg0\Field3 + 0.875), (arg0\Field37 - 3.625), 0.0, 90.0, 0.0)
            local2\Field20 = 270.0
            local2\Field8 = 45.0
            local7 = createitem("Class D Orientation Leaflet", $00, (arg0\Field40 - 15.36719), (arg0\Field3 + (1.0 / 1.505882)), (arg0\Field37 + (1.0 / 32.0)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $05
            local0 = createdoor(arg0, (arg0\Field40 - 5.46875), (arg0\Field3 - 0.5), (arg0\Field37 - 1.5), 0.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 0.5), arg0\Field3, (arg0\Field37 + 2.5), 90.0, $00, $00, $04, $00, $00)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 0.375), arg0\Field3, (arg0\Field37 - 1.5), 0.0, $00, $00, $04, $00, $00)
            arg0\Field25[$02] = local0
            createdoor(arg0, (arg0\Field40 + 1.84375), arg0\Field3, (arg0\Field37 - 1.5), 0.0, $00, $00, $03, $00, $00)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + (1.0 / 3.2)), (arg0\Field3 + 0.75), (arg0\Field37 - (1.0 / 1.570552)), 270.0, $01)
            rotateentity(arg0\Field9[$00]\Field1, 80.0, entityyaw(arg0\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 4.5), (arg0\Field3 + 3.515625), (arg0\Field37 + 0.6875), 0.0, $01, (arg0\Field40 - 6.703125), (arg0\Field3 + 0.625), (arg0\Field37 + 0.6875), 0.0, 90.0, 0.0)
            local2\Field20 = 90.0
            local2\Field8 = 0.0
            local2\Field17 = $00
            local2\Field9 = 0.0
            local2\Field10 = $01
            local2\Field5 = $01
            scaleentity(local2\Field3, 1.75, 1.75, 1.0, $00)
            camerazoom(local2\Field21, 1.5)
            hideentity(local2\Field15)
            arg0\Field2[$00] = local2
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 6.0), (arg0\Field3 + 2.851562), (arg0\Field37 + 0.75), $00)
            rotateentity(arg0\Field27[$00], 0.0, -90.0, 0.0, $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 - 5.46875), arg0\Field3, (arg0\Field37 + 0.75), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            local7 = createitem("Document SCP-205", $00, (arg0\Field40 - 1.394531), (arg0\Field3 + (1.0 / 3.657143)), (arg0\Field37 + (1.0 / 1.706667)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Ballistic Helmet", $26, (arg0\Field40 + (1.0 / 1.242718)), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - (1.0 / 3.2)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + (1.0 / 1.242718)), (arg0\Field3 + (1.0 / 1.347368)), (arg0\Field37 + 0.703125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 2.910156), (arg0\Field3 + 0.9375), (arg0\Field37 - 0.234375))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Bloody Level 3 Key Card", $5C, (arg0\Field40 - 3.808594), (arg0\Field3 - (1.0 / 17.06667)), (arg0\Field37 + 2.539062), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 + 0.734375), (arg0\Field37 - 2.828125))
        Case $06
            local22 = loadtexture_strict("GFX\Map\Textures\Door01_914.png", $01, $00, 1.0)
            local0 = createdoor(arg0, (arg0\Field40 - 4.050781), arg0\Field3, (arg0\Field37 + 2.0625), 180.0, $01, $08, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            entityinstance(local0\Field0, $00)
            entityinstance(local0\Field7, $00)
            entityinstance(local0\Field51, $00)
            entitytexture(local0\Field0, local22, $00, $00)
            entitytexture(local0\Field7, local22, $00, $00)
            entitytexture(local0\Field51, local22, $00, $00)
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.578125), arg0\Field3, (arg0\Field37 + 2.0625), 180.0, $01, $08, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            entitytexture(local0\Field0, local22, $00, $00)
            entitytexture(local0\Field7, local22, $00, $00)
            entitytexture(local0\Field51, local22, $00, $00)
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$01] = local0
            deletesingletextureentryfromcache(local22, $00)
            local22 = $00
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 1.4375), 0.0, $00, $03, $04, $00, $00)
            local0\Field21 = $01
            positionentity(local0\Field40[$00], (arg0\Field40 - 1.9375), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - 1.085938), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.025), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            turnentity(local0\Field40[$00], 0.0, 90.0, 0.0, $00)
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.753906), arg0\Field3, (arg0\Field37 - 2.75), 90.0, $00, $00, $04, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.057), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.057), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 3.953125), (arg0\Field3 + 0.75), (arg0\Field37 - 3.8125), 180.0, $00)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - 5.078125), (arg0\Field3 + 0.75), (arg0\Field37 - 3.8125), 180.0, $00)
            arg0\Field27[$00] = loadmesh_strict("GFX\Map\Props\scp_914_key.b3d", $00, $01)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 1.625), (arg0\Field3 + (1.0 / 1.347368)), (arg0\Field37 + 1.460938), $01)
            arg0\Field27[$01] = loadmesh_strict("GFX\Map\Props\scp_914_knob.b3d", $00, $01)
            positionentity(arg0\Field27[$01], (arg0\Field40 - 1.625), (arg0\Field3 + (1.0 / 1.113043)), (arg0\Field37 + 1.460938), $01)
            For local25 = $00 To $01 Step $01
                scaleentity(arg0\Field27[local25], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $01)
                entitypickmode(arg0\Field27[local25], $02, $01)
                entityparent(arg0\Field27[local25], arg0\Field15, $01)
            Next
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 - 4.410156), (arg0\Field3 + 0.5), (arg0\Field37 + 2.480469), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 + 1.203125), (arg0\Field3 + 0.5), (arg0\Field37 + 2.5), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = createbutton($00, (arg0\Field40 - 4.78125), (arg0\Field3 + 0.6875), (arg0\Field37 - 3.867188), 0.0, 180.0, 0.0, arg0\Field15, $01, $01)
            arg0\Field27[$05] = loadrmesh("GFX\Map\cont1_914_blinds.rmesh", Null, $00)
            scaleentity(arg0\Field27[$05], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            entityparent(arg0\Field27[$05], arg0\Field15, $01)
            arg0\Field27[$06] = createpivot($00)
            positionentity(arg0\Field27[$06], (arg0\Field40 - 3.65625), (arg0\Field3 + 0.515625), (arg0\Field37 - 1.15625), $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
            arg0\Field27[$07] = loadanimmesh_strict("GFX\Map\Props\scp_914_gears.b3d", $00, $01)
            local24 = (1.0 / 191.0448)
            scaleentity(arg0\Field27[$07], local24, local24, local24, $00)
            positionentity(arg0\Field27[$07], (arg0\Field40 - 1.59375), (arg0\Field3 + (1.0 / 32.0)), (arg0\Field37 + 2.5), $00)
            rotateentity(arg0\Field27[$07], 0.0, 270.0, 0.0, $00)
            entityparent(arg0\Field27[$07], arg0\Field15, $01)
            local7 = createitem("SCP-914 Test Logs #1", $00, (arg0\Field40 + 2.101562), (arg0\Field3 + (1.0 / 1.438202)), (arg0\Field37 + (1.0 / 2.015748)), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-914 Test Logs #2", $00, (arg0\Field40 - 4.816406), (arg0\Field3 + (1.0 / 1.438202)), (arg0\Field37 - (1.0 / 1.319588)), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("First Aid Kit", $34, (arg0\Field40 - 5.375), (arg0\Field3 + 0.4375), (arg0\Field37 - 2.679688), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 270.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Dr. L's Note #1", $00, (arg0\Field40 - 2.101562), (arg0\Field3 + (1.0 / 1.024)), (arg0\Field37 - 1.425781), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 2.75))
        Case $08
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $08) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], $00)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadrmesh("GFX\Map\ventilation_fan.rmesh", Null, $00)
            EndIf
            scaleentity(arg0\Field27[$00], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 1.054688), (arg0\Field3 + 2.0625), arg0\Field37, $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            hideentity(arg0\Field27[$00])
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 1.378906), (arg0\Field3 + 0.5), (arg0\Field37 - 1.0), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            If (rand($02, $01) = $01) Then
                local7 = createitem("Empty Cup", $2C, (arg0\Field40 + 1.914062), (arg0\Field3 + 0.625), (arg0\Field37 - 0.90625), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $0A
            local0 = createdoor(arg0, (arg0\Field40 + 2.625), (arg0\Field3 + 1.5), (arg0\Field37 + 2.546875), 90.0, $00, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 2.0), (arg0\Field3 + 1.5), (arg0\Field37 - 2.25), 0.0, $00, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 + 1.875), arg0\Field3, (arg0\Field37 - 2.46875), 0.0, $00, $07, $03, $00, $00)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.06), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            createdoor(arg0, (arg0\Field40 + 1.125), (arg0\Field3 + 1.5), (arg0\Field37 + 2.546875), 90.0, $00, $00, $03, $00, $00)
            If (rand($02, $01) = $01) Then
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 - 2.335938), (arg0\Field3 + 2.1875), (arg0\Field37 + 3.710938), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem("Cigarette", $0F, (arg0\Field40 - 2.9375), (arg0\Field3 + 2.148438), (arg0\Field37 + (1.0 / 1.551515)), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            Else
                local7 = createitem("Level 1 Key Card", $5A, (arg0\Field40 - 2.335938), (arg0\Field3 + 2.1875), (arg0\Field37 + 3.710938), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem("Document SCP-2022", $00, (arg0\Field40 - 2.9375), (arg0\Field3 + 2.148438), (arg0\Field37 + (1.0 / 1.551515)), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $0C
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 2.066406), 0.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            positionentity(local0\Field40[$00], (arg0\Field40 - 3.898438), entityy(local0\Field40[$00], $01, 1.0), arg0\Field37, $01)
            rotateentity(local0\Field40[$00], 0.0, 90.0, 0.0, $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 0.057), $01)
            local1 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 2.066406), 180.0, $01, $00, $00, $00, $00)
            local1\Field10 = $00
            freeentity(local1\Field40[$00])
            local1\Field40[$00] = $00
            positionentity(local1\Field40[$01], entityx(local1\Field40[$01], $01, 1.0), entityy(local1\Field40[$01], $01, 1.0), (entityz(local1\Field40[$01], $01, 1.0) + 0.057), $01)
            local0\Field26 = local1
            local1\Field26 = local0
        Case $0D
            createdoor(arg0, (arg0\Field40 + 2.082031), arg0\Field3, arg0\Field37, 90.0, $00, $06, $00, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 + 2.8125), arg0\Field3, (arg0\Field37 + 1.0), 0.0, $00, $07, $03, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.15), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + 2.566406), (arg0\Field3 + 0.59375), (arg0\Field37 + 3.449219), 0.0, $00)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 + 2.25), (arg0\Field3 + 0.640625), (arg0\Field37 + 3.5), 0.0, $00)
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 + 3.929688), (arg0\Field3 + 0.53125), (arg0\Field37 + 1.265625))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $0E
            createdoor(arg0, (arg0\Field40 + 1.089844), arg0\Field3, (arg0\Field37 + 2.25), 90.0, $00, $04, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 + 1.089844), arg0\Field3, (arg0\Field37 - 2.25), 90.0, $01, $04, $00, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - (1.0 / 1.04918)), arg0\Field3, arg0\Field37, 90.0, $00, $00, $00, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.048), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.048), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 4.75), (arg0\Field3 - 1.5), (arg0\Field37 - 4.0), 0.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 4.75), (arg0\Field3 - 1.5), (arg0\Field37 + 4.0), 180.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 0.90625), (arg0\Field3 - 1.5), (arg0\Field37 - 2.515625), 90.0, $00, $07, $03, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 0.90625), (arg0\Field3 - 1.5), (arg0\Field37 + 2.515625), 90.0, $00, $07, $03, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local2 = createsecuritycam(arg0, (arg0\Field40 + 0.71875), (arg0\Field3 + 2.75), (arg0\Field37 + 3.71875), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 130.0
            local2\Field8 = 40.0
            local7 = createitem("Level 0 Key Card", $59, (arg0\Field40 + 2.875), (arg0\Field3 + 0.9375), (arg0\Field37 + 2.9375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + 2.875), (arg0\Field3 + 0.6875), (arg0\Field37 + 2.125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 2.875), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 - 1.75))
            entityparent(local7\Field9, arg0\Field15, $01)
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 + 2.851562), (arg0\Field3 + 0.6875), (arg0\Field37 - 2.265625))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 + 2.890625), (arg0\Field3 + 0.9375), (arg0\Field37 - 2.929688))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local7 = createitem("Incident Report SCP-1048-A", $00, (arg0\Field40 + 2.875), (arg0\Field3 + 0.875), (arg0\Field37 - 1.875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Risk Classes", $00, (arg0\Field40 - 1.984375), (arg0\Field3 - 0.9375), (arg0\Field37 - 1.476562), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Gas Mask", $38, (arg0\Field40 - 3.5), (arg0\Field3 - 0.96875), (arg0\Field37 + 3.507812), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (key2_spawnrate = $03) Then
                If (rand($02, $01) <> 0) Then
                    local7 = createitem("White Key", $68, (arg0\Field40 - (1.0 / 0.4096)), (arg0\Field3 - 1.078125), (arg0\Field37 - 1.296875), $00, $00, $00, 1.0, $00)
                Else
                    local7 = createitem("White Key", $68, (arg0\Field40 - (1.0 / 0.4096)), (arg0\Field3 - 1.078125), (arg0\Field37 + 1.296875), $00, $00, $00, 1.0, $00)
                EndIf
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $71
            createdoor(arg0, (arg0\Field40 + 1.089844), arg0\Field3, (arg0\Field37 + 2.25), 90.0, $00, $04, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 + 1.089844), arg0\Field3, (arg0\Field37 - 2.25), 90.0, $01, $04, $00, $00, $00)
            local7 = createitem("Document SCP-2022", $00, (arg0\Field40 + 2.839844), (arg0\Field3 + (1.0 / 2.485437)), (arg0\Field37 - 2.195312), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Warning Labels #3", $00, (arg0\Field40 + 2.878906), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 + 1.835938), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Syringe", $55, (arg0\Field40 + 2.867188), (arg0\Field3 + 0.640625), (arg0\Field37 + 1.835938), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + 2.851562), (arg0\Field3 + 0.640625), (arg0\Field37 - 3.226562), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $0F
            local0 = createdoor(arg0, (arg0\Field40 + 1.75), arg0\Field3, arg0\Field37, -90.0, $01, $01, $00, $00, $00)
            local0\Field47 = $00
            arg0\Field25[$00] = local0
        Case $10,$11
            local0 = createdoor(arg0, (arg0\Field40 + 1.324219), arg0\Field3, (arg0\Field37 - 1.800781), 0.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.324219), arg0\Field3, (arg0\Field37 + 1.800781), 180.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.789062), arg0\Field3, (arg0\Field37 + 2.875), 90.0, $00, $00, $00, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.04), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.04), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            If (arg0\Field22\Field21 = $11) Then
                arg0\Field27[$00] = createbutton($01, (arg0\Field40 - 1.847656), (arg0\Field3 + 0.6875), (arg0\Field37 - (1.0 / 1.896296)), 0.0, 270.0, 25.0, arg0\Field15, $01, $01)
                local6 = setemitter(arg0, (arg0\Field40 + 1.023438), (arg0\Field3 + 1.28125), (arg0\Field37 - 1.613281), $01)
                local6\Field7 = $02
                If (key2_spawnrate = $02) Then
                    local7 = createitem("White Key", $68, (arg0\Field40 - 3.59375), (arg0\Field3 + 1.09375), (arg0\Field37 + (1.0 / 1.620253)), $00, $00, $00, 1.0, $00)
                    entityparent(local7\Field9, arg0\Field15, $01)
                EndIf
            Else
                local0 = createdoor(arg0, (arg0\Field40 - 1.789062), arg0\Field3, arg0\Field37, 90.0, $00, $00, $04, $00, $00)
                positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.04), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 1.12), $01)
                positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.04), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.07), $01)
                arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + (1.0 / 1.580247)), (arg0\Field3 + 0.75), (arg0\Field37 - 1.089844), 270.0, $01)
                arg0\Field27[$00] = createpivot($00)
                positionentity(arg0\Field27[$00], (arg0\Field40 + 1.3125), (arg0\Field3 + 0.5), arg0\Field37, $00)
                entityparent(arg0\Field27[$00], arg0\Field15, $01)
                If (T20BDD24F02\Field0 <> 0) Then
                    local38 = ((arg0\Field40 = T20BDD24F02\Field2) And (arg0\Field37 = T20BDD24F02\Field1))
                EndIf
                If (((T20BDD24F02\Field0 = $00) Lor local38) <> 0) Then
                    arg0\Field27[$01] = GUESSEDcopyentity_2(local0\Field0, $00)
                    scaleentity(arg0\Field27[$01], (1.0 / 13.97457), (1.0 / 19.86454), (1.0 / 18.04954), $00)
                    entitytype(arg0\Field27[$01], $01, $00)
                    positionentity(arg0\Field27[$01], (arg0\Field40 + 1.324219), arg0\Field3, (arg0\Field37 + 1.800781), $00)
                    rotateentity(arg0\Field27[$01], 0.0, 0.0, 0.0, $00)
                    entityparent(arg0\Field27[$01], arg0\Field15, $01)
                    moveentity(arg0\Field27[$01], 150.0, 0.0, 5.0, $00)
                    T20BDD24F02\Field0 = $01
                    T20BDD24F02\Field2 = arg0\Field40
                    T20BDD24F02\Field1 = arg0\Field37
                    freeentity(arg0\Field25[$01]\Field7)
                    arg0\Field25[$01]\Field7 = $00
                EndIf
            EndIf
            createcustomcenter(arg0, (arg0\Field40 + 1.3125), (arg0\Field37 + 0.125))
        Case $12
            createdoor(arg0, (arg0\Field40 - 0.375), arg0\Field3, arg0\Field37, 90.0, $00, $00, $02, $00, $00)
            local2 = createsecuritycam(arg0, (arg0\Field40 + 3.671875), (arg0\Field3 + 1.699219), (arg0\Field37 - 3.671875), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 45.0
            local2\Field8 = 30.0
            local12 = (arg0\Field40 - 1.84375)
            local14 = (arg0\Field37 - (1.0 / 12.8))
            local3 = createdecal($16, local12, (arg0\Field3 + 0.005), local14, 90.0, rnd(360.0, 0.0), 0.0, rnd(0.7, 0.8), 1.0, $00, $01, $00, $00, $00)
            local3\Field14 = 0.00005
            local3\Field3 = 6.0
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($01, local12, ((arg0\Field3 + 2.75) - 0.005), local14, -90.0, rnd(360.0, 0.0), 0.0, rnd(0.2, 0.3), 0.7, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($16, local12, ((arg0\Field3 + 2.75) - 0.005), local14, -90.0, rnd(360.0, 0.0), 0.0, rnd(0.7, 0.8), 1.0, $00, $01, $00, $00, $00)
            local3\Field14 = 0.00005
            local3\Field3 = 7.5
            entityparent(local3\Field0, arg0\Field15, $01)
            setemitter(arg0, local12, (arg0\Field3 + 2.75), local14, $16)
            setemitter(arg0, local12, (arg0\Field3 + 0.01), local14, $17)
            local7 = createitem("Level 1 Key Card", $5A, (arg0\Field40 + 3.675781), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 - 2.980469), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Origami", $02, (arg0\Field40 + 3.574219), (arg0\Field3 + 1.0), (arg0\Field37 + 2.082031), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 2.371094), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.664062))
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 - 1.5), arg0\Field37)
        Case $13
            local0 = createdoor(arg0, (arg0\Field40 + 1.875), arg0\Field3, (arg0\Field37 - 2.5), 90.0, $00, $00, $05, $00, $00)
            local0\Field47 = $00
            positionentity(local0\Field40[$00], (arg0\Field40 + 2.25), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - 1.851562), $01)
            rotateentity(local0\Field40[$00], 0.0, 270.0, 0.0, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 2.125), (arg0\Field3 + 1.875), (arg0\Field37 + 1.0), 270.0, $00, $07, $05, $00, $00)
            local0\Field47 = $00
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 5.875), (arg0\Field3 + 1.875), (arg0\Field37 + 3.75), 180.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - (1.0 / 5.22449)), (arg0\Field3 + 2.691406), (arg0\Field37 + 3.566406), 0.0, $01)
            arg0\Field16[$00] = addlight(arg0, (arg0\Field40 + 3.892578), (arg0\Field3 + 2.955078), (arg0\Field37 + 2.376953), $02, (1.0 / 17.06667), $FF, $32, $32, $01, 0.1, $00)
            arg0\Field16[$00]\Field13 = $01
            hideentity(arg0\Field16[$00]\Field7)
            local7 = createitem("Note from Nobody #3", $00, (arg0\Field40 + 3.441406), (arg0\Field3 + 2.5), (arg0\Field37 - (1.0 / 14.22222)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            arg0\Field26[$00] = loadanimtexture_strict("GFX\Map\Screens\SL_monitors_checkpoint.png", $01, $200, $200, $00, $03, $01)
            arg0\Field26[$01] = loadanimtexture_strict("GFX\Map\Screens\SL_monitors.png", $01, $200, $200, $00, $0B, $01)
            arg0\Field26[$02] = loadanimtexture_strict("GFX\Map\Screens\SL_monitors_interference.png", $01, $200, $200, $00, $06, $01)
            local24 = (1.0 / 142.2222)
            local39 = ((meshwidth(mon_i\Field3[$00]) * local24) * 0.475)
            local40 = ((meshheight(mon_i\Field3[$00]) * local24) * 0.475)
            For local25 = $00 To $0D Step $01
                local41 = (((((local25 = $01) Lor (local25 = $04)) Lor (local25 = $06)) Lor (local25 = $0C)) Lor (local25 = $0D))
                arg0\Field27[local25] = copyentity(mon_i\Field3[$00], $00)
                scaleentity(arg0\Field27[local25], local24, local24, local24, $00)
                If (local41 = $00) Then
                    local23 = createsprite($00)
                    entityfx(local23, $10)
                    spriteviewmode(local23, $02)
                    scalesprite(local23, local39, local40)
                    Select local25
                        Case $00
                            local27 = $00
                            local12 = -207.94
                            local13 = 648.0
                            local14 = -60.0686
                            local29 = 105.0
                        Case $02
                            local27 = $01
                            local12 = -207.94
                            local13 = 872.0
                            local14 = -60.0686
                            local29 = 105.0
                        Case $03
                            local27 = $02
                            local12 = -231.489
                            local13 = 648.0
                            local14 = 95.744
                            local29 = 90.0
                        Case $05
                            local27 = $03
                            local12 = -231.489
                            local13 = 648.0
                            local14 = 255.744
                        Case $07
                            local27 = $04
                            local12 = -231.489
                            local13 = 872.0
                            local14 = 255.744
                            local29 = 90.0
                        Case $08
                            local27 = $0A
                            local12 = -231.489
                            local13 = 648.0
                            local14 = 415.744
                            local29 = 90.0
                        Case $09
                            local27 = $09
                            local12 = -231.489
                            local13 = 760.0
                            local14 = 415.744
                            local29 = 90.0
                        Case $0A
                            local27 = $08
                            local12 = -231.489
                            local13 = 872.0
                            local14 = 415.744
                            local29 = 90.0
                        Case $0B
                            local27 = $05
                            local12 = -208.138
                            local13 = 648.0
                            local14 = 571.583
                            local29 = 75.0
                    End Select
                    GUESSEDcreatesurface(local23, $00, $420)
                    entitytexture(local23, arg0\Field26[$01], local27, $00)
                    entityparent(local23, arg0\Field27[local25], $01)
                Else
                    Select local25
                        Case $01
                            local26 = $14
                            local12 = -207.94
                            local13 = 760.0
                            local14 = -60.0686
                            local29 = 105.0
                        Case $04
                            local26 = $12
                            local12 = -231.489
                            local13 = 872.0
                            local14 = 95.744
                            local29 = 90.0
                        Case $06
                            local26 = $13
                            local12 = -231.489
                            local13 = 760.0
                            local14 = 255.744
                            local29 = 90.0
                        Case $0C
                            local26 = $15
                            local12 = -208.138
                            local13 = 760.0
                            local14 = 571.583
                            local29 = 75.0
                        Case $0D
                            local26 = $16
                            local12 = -208.138
                            local13 = 872.0
                            local14 = 571.583
                            local29 = 75.0
                    End Select
                    arg0\Field27[local26] = createsprite($00)
                    entityfx(arg0\Field27[local26], $10)
                    spriteviewmode(arg0\Field27[local26], $02)
                    scalesprite(arg0\Field27[local26], local39, local40)
                    GUESSEDcreatesurface(arg0\Field27[local26], $00, $420)
                    entitytexture(arg0\Field27[local26], arg0\Field26[$02], $00, $00)
                    entityparent(arg0\Field27[local26], arg0\Field27[local25], $01)
                EndIf
                positionentity(arg0\Field27[local25], (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + (local13 * (1.0 / 256.0))), (arg0\Field37 + (local14 * (1.0 / 256.0))), $00)
                rotateentity(arg0\Field27[local25], 0.0, local29, 0.0, $00)
                entityparent(arg0\Field27[local25], arg0\Field15, $01)
                hideentity(arg0\Field27[local25])
            Next
            arg0\Field27[$0E] = createpivot($00)
            positionentity(arg0\Field27[$0E], arg0\Field40, (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 - 3.125), $01)
            entityparent(arg0\Field27[$0E], arg0\Field15, $01)
            arg0\Field27[$0F] = createpivot($00)
            positionentity(arg0\Field27[$0F], (arg0\Field40 + 2.734375), (arg0\Field3 + 2.734375), (arg0\Field37 + 1.0), $00)
            entityparent(arg0\Field27[$0F], arg0\Field15, $01)
            arg0\Field27[$10] = createpivot($00)
            positionentity(arg0\Field27[$10], (arg0\Field40 - 0.234375), (arg0\Field3 + 2.734375), (arg0\Field37 + (1.0 / 1.28)), $00)
            entityparent(arg0\Field27[$10], arg0\Field15, $01)
            arg0\Field27[$11] = createpivot($00)
            positionentity(arg0\Field27[$11], (arg0\Field40 - 0.1875), (arg0\Field3 + 2.109375), (arg0\Field37 + 2.5625), $00)
            entityparent(arg0\Field27[$11], arg0\Field15, $01)
            local2 = createsecuritycam(arg0, (arg0\Field40 - (1.0 / 1.610063)), (arg0\Field3 + 1.5), (arg0\Field37 - 3.628906), 20.0, $01, (arg0\Field40 - (1.0 / 1.108225)), (arg0\Field3 + 2.96875), (arg0\Field37 + 0.374), 0.0, 90.0, 0.0)
            local2\Field20 = 315.0
        Case $14
            local0 = createdoor(arg0, (arg0\Field40 - 5.03125), arg0\Field3, arg0\Field37, 270.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            local0\Field41 = $01
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            moveentity(local0\Field40[$01], 0.0, 0.0, -8.0, $00)
            freeentity(local0\Field7)
            local0\Field7 = $00
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 2.96875), arg0\Field3, arg0\Field37, 270.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            local0\Field47 = $00
            local0\Field41 = $01
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            moveentity(local0\Field40[$01], 0.0, 0.0, -8.0, $00)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.03125), arg0\Field3, arg0\Field37, 270.0, $00, $00, $00, $00, $00)
            moveentity(local0\Field40[$00], 0.0, 0.0, -8.0, $00)
            moveentity(local0\Field40[$01], 0.0, 0.0, -8.0, $00)
            local0\Field10 = $00
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.03125), arg0\Field3, arg0\Field37, 270.0, $00, $00, $00, $00, $00)
            moveentity(local0\Field40[$00], 0.0, 0.0, -8.0, $00)
            moveentity(local0\Field40[$01], 0.0, 0.0, -8.0, $00)
            local0\Field10 = $00
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 2.96875), arg0\Field3, arg0\Field37, 90.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            local0\Field47 = $00
            local0\Field41 = $01
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            moveentity(local0\Field40[$01], 0.0, 0.0, -8.0, $00)
            arg0\Field25[$04] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 5.03125), arg0\Field3, arg0\Field37, 90.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            local0\Field41 = $01
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            moveentity(local0\Field40[$01], 0.0, 0.0, -8.0, $00)
            freeentity(local0\Field7)
            local0\Field7 = $00
            arg0\Field25[$05] = local0
            arg0\Field27[$00] = loadrmesh("GFX\Map\room2_storage_fake_hall.rmesh", Null, $00)
            scaleentity(arg0\Field27[$00], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 4.0), arg0\Field3, arg0\Field37, $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            hideentity(arg0\Field27[$00])
            arg0\Field27[$01] = copyentity(arg0\Field27[$00], $00)
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 4.0), arg0\Field3, arg0\Field37, $00)
            rotateentity(arg0\Field27[$01], 0.0, 180.0, 0.0, $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            hideentity(arg0\Field27[$01])
            arg0\Field27[$02] = loadrmesh("GFX\Map\room2_storage_posters.rmesh", Null, $00)
            scaleentity(arg0\Field27[$02], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$02], arg0\Field40, arg0\Field3, arg0\Field37, $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            hideentity(arg0\Field27[$02])
            local7 = createitem("Document SCP-939", $00, (arg0\Field40 + 1.375), (arg0\Field3 + 0.6875), (arg0\Field37 + 1.0), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 4.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 1.375), (arg0\Field3 + 0.4375), (arg0\Field37 + 1.75))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Empty Cup", $2C, (arg0\Field40 - 2.625), (arg0\Field3 + 0.9375), (arg0\Field37 + 1.125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Level 0 Key Card", $59, (arg0\Field40 - 2.625), (arg0\Field3 + 0.9375), (arg0\Field37 + 0.875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $15,$39,$74,$62
            local0 = createdoor(arg0, (arg0\Field40 - 1.125), arg0\Field3, (arg0\Field37 + 2.25), 90.0, (arg0\Field22\Field21 = $74), $00, $06, $00, $00)
            arg0\Field25[$00] = local0
            If (arg0\Field22\Field21 <> $74) Then
                arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 1.433594), (arg0\Field3 + 0.75), (arg0\Field37 - 0.828125), -90.0, $01)
                local2 = createsecuritycam(arg0, arg0\Field40, (arg0\Field3 + 2.75), (arg0\Field37 - 3.722656), 30.0, $01, (arg0\Field40 - 1.523438), (arg0\Field3 + 0.796875), (arg0\Field37 + (1.0 / 7.529412)), 0.0, -90.0, 0.0)
                local2\Field8 = 0.0
                If (rand($02, $01) = $01) Then
                    local2\Field1 = rand($2BC, $01)
                EndIf
            Else
                arg0\Field25[$00]\Field47 = $00
                local2 = createsecuritycam(arg0, arg0\Field40, (arg0\Field3 + 2.75), (arg0\Field37 - 3.722656), 30.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
                local2\Field8 = 0.0
                local6 = setemitter(arg0, (arg0\Field40 - 1.539062), (arg0\Field3 + (1.0 / 1.299492)), (arg0\Field37 + (1.0 / 1.21327)), $1F)
                local6\Field7 = $04
                arg0\Field27[$03] = createpivot($00)
                positionentity(arg0\Field27[$03], (arg0\Field40 - 1.433594), (arg0\Field3 + 0.75), (arg0\Field37 - (1.0 / 1.21327)), $00)
                entityparent(arg0\Field27[$03], arg0\Field15, $01)
                arg0\Field27[$04] = createpivot($00)
                positionentity(arg0\Field27[$04], (arg0\Field40 - (1.0 / 0.64)), (arg0\Field3 + (1.0 / 1.802817)), (arg0\Field37 + (1.0 / 1.273632)), $00)
                entityparent(arg0\Field27[$04], arg0\Field15, $01)
                local3 = createdecal($18, (arg0\Field40 - 2.0), (arg0\Field3 + 0.005), (arg0\Field37 + 0.640625), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.3, 0.4), 0.8, $00, $01, $00, $00, $00)
                entityparent(local3\Field0, arg0\Field15, $01)
                local3 = createdecal($18, (arg0\Field40 - 1.546875), (arg0\Field3 + (1.0 / 1.430168)), (arg0\Field37 + (1.0 / 1.299492)), 0.0, 270.0, 0.0, 0.17, 0.8, $00, $01, $00, $00, $00)
                entityparent(local3\Field0, arg0\Field15, $01)
                local3 = createdecal($18, (arg0\Field40 - 1.376953), (arg0\Field3 + (1.0 / 1.497076)), (arg0\Field37 + 0.90625), 0.0, 270.0, 0.0, rnd(0.5, 0.6), 0.8, $00, $01, $00, $00, $00)
                entityparent(local3\Field0, arg0\Field15, $01)
            EndIf
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - 1.433594), (arg0\Field3 + 0.75), (arg0\Field37 - 0.515625), -90.0, $01)
            arg0\Field16[$00] = addlight(arg0, (arg0\Field40 - 0.125), (arg0\Field3 + 2.226562), arg0\Field37, $02, (1.0 / 17.06667), $FF, $32, $32, $01, 0.1, $00)
            arg0\Field16[$00]\Field13 = $01
            hideentity(arg0\Field16[$00]\Field7)
            arg0\Field16[$01] = addlight(arg0, arg0\Field40, (arg0\Field3 + 1.757812), arg0\Field37, $02, 3.515625, $E4, $100, $132, $00, 0.0, $01)
            arg0\Field16[$01]\Field13 = $01
            arg0\Field16[$01]\Field17 = 0.0
            hideentity(arg0\Field16[$01]\Field7)
            arg0\Field27[$00] = createsprite($00)
            arg0\Field30[$00] = $01
            entitytexture(arg0\Field27[$00], X2Z260BF0Z\Field0[$03], $00, $00)
            spriteviewmode(arg0\Field27[$00], $02)
            entityblend(arg0\Field27[$00], $03)
            entityfx(arg0\Field27[$00], $19)
            positionentity(arg0\Field27[$00], arg0\Field40, (arg0\Field3 + 1.0), arg0\Field37, $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            hideentity(arg0\Field27[$00])
            GUESSEDcreatesurface(arg0\Field27[$00], $00, $420)
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (((((local4\Field22\Field21 = $15) Lor (local4\Field22\Field21 = $39)) Lor (local4\Field22\Field21 = $74)) Lor (local4\Field22\Field21 = $62)) <> 0) Then
                        arg0\Field27[$01] = copyentity(local4\Field27[$01], $00)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$01] = $00) Then
                arg0\Field27[$01] = loadrmesh("GFX\Map\room2_tesla_blinds.rmesh", Null, $00)
            EndIf
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            hideentity(arg0\Field27[$01])
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 - 1.273438), (arg0\Field3 + 0.515625), (arg0\Field37 - 2.25), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 1.0))
        Case $16
            local0 = createdoor(arg0, (arg0\Field40 - 1.0), arg0\Field3, (arg0\Field37 + 2.5), 90.0, $00, $00, $03, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 4.0), arg0\Field3, (arg0\Field37 + 2.5), 270.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            createdoor(arg0, (arg0\Field40 - 2.0), arg0\Field3, (arg0\Field37 + 1.46875), 0.0, $00, $00, $00, $00, $00)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 2.5), (arg0\Field3 + 0.5), (arg0\Field37 - 3.5625), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 - 2.0), (arg0\Field3 + 0.5), (arg0\Field37 + 0.765625), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createsprite($00)
            arg0\Field30[$02] = $01
            local22 = loadtexture_strict("GFX\Map\Textures\glass.png", $03, $00, 1.0)
            textureblend(local22, $02)
            entitytexture(arg0\Field27[$02], local22, $00, $00)
            deletesingletextureentryfromcache(local22, $00)
            local22 = $00
            spriteviewmode(arg0\Field27[$02], $02)
            scalesprite(arg0\Field27[$02], (1.0 / 2.813187), (1.0 / 2.694737))
            positionentity(arg0\Field27[$02], (arg0\Field40 - 2.5), (arg0\Field3 + 0.875), (arg0\Field37 - 0.8125), $00)
            turnentity(arg0\Field27[$02], 0.0, 180.0, 0.0, $00)
            entityalpha(arg0\Field27[$02], 0.5)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            hideentity(arg0\Field27[$02])
            GUESSEDcreatesurface(arg0\Field27[$02], $00, $40)
            local7 = createitem("S-NAV Navigator", $49, (arg0\Field40 - 1.796875), (arg0\Field3 + (1.0 / 1.219048)), (arg0\Field37 - (1.0 / 2.37037)), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(100.0, 0.0)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Level 2 Key Card", $5B, (arg0\Field40 - 3.667969), (arg0\Field3 + (1.0 / 1.868613)), (arg0\Field37 + 0.453125), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 180.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Security Room Modules", $00, (arg0\Field40 - 3.695312), (arg0\Field3 + (1.0 / 1.868613)), (arg0\Field37 + (1.0 / 1.011858)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $17
            createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, (arg0\Field37 + 2.625), 270.0, $00, $00, $05, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 2.0), (arg0\Field3 - 3.0), (arg0\Field37 - 1.25), 0.0, $00, $00, $00, $00, $00)
            local0\Field47 = $00
            positionentity(local0\Field40[$00], (arg0\Field40 + 0.6875), (arg0\Field3 - 2.195312), (arg0\Field37 - 1.382812), $01)
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            arg0\Field25[$00] = local0
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + 0.9375), (arg0\Field3 - 2.28125), (arg0\Field37 - 1.433594), 0.0, $00)
            arg0\Field16[$00] = addlight(arg0, (arg0\Field40 - (1.0 / 5.885057)), (arg0\Field3 - 2.242188), (arg0\Field37 - 1.414062), $02, (1.0 / 17.06667), $FF, $32, $32, $01, 0.1, $00)
            arg0\Field16[$00]\Field13 = $01
            hideentity(arg0\Field16[$00]\Field7)
            arg0\Field27[$00] = loadrmesh("GFX\Map\cont2_012_box.rmesh", Null, $00)
            scaleentity(arg0\Field27[$00], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 1.40625), (arg0\Field3 - (1.0 / 1.969231)), (arg0\Field37 + 1.78125), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            hideentity(arg0\Field27[$00])
            arg0\Field27[$01] = loadrmesh("GFX\Map\ventilation_fan.rmesh", Null, $00)
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$01], (arg0\Field40 - 1.757812), (arg0\Field3 + 2.0625), (arg0\Field37 - 1.492188), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            hideentity(arg0\Field27[$01])
            arg0\Field27[$02] = loadmesh_strict("GFX\Map\Props\scp_012.b3d", $00, $01)
            scaleentity(arg0\Field27[$02], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$02], (arg0\Field40 - 1.40625), (arg0\Field3 - 0.703125), (arg0\Field37 + 1.78125), $00)
            entityparent(arg0\Field27[$02], arg0\Field27[$00], $01)
            local7 = createitem("White Severed Hand", $64, (arg0\Field40 - 3.0625), ((arg0\Field3 - 2.25) + 0.3), (arg0\Field37 + 2.5), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-012", $00, (arg0\Field40 - 0.21875), (arg0\Field3 - 2.25), (arg0\Field37 - 1.59375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local3 = createdecal($03, (arg0\Field40 - 3.0625), ((arg0\Field3 - 3.0) + 0.01), (arg0\Field37 + 2.5), 90.0, rnd(360.0, 0.0), 0.0, 0.5, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
        Case $18
            local0 = createdoor(arg0, (arg0\Field40 + 1.0625), arg0\Field3, arg0\Field37, 90.0, $00, $00, $05, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) + 0.061), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.061), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 1.0625), arg0\Field3, arg0\Field37, 270.0, $01, $00, $05, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.061), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.061), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            createdoor(arg0, (arg0\Field40 - 2.1875), arg0\Field3, (arg0\Field37 - 1.0625), 0.0, $00, $00, $05, $00, $00)
            createdoor(arg0, (arg0\Field40 - 2.1875), arg0\Field3, (arg0\Field37 + 1.0625), 0.0, $01, $00, $05, $00, $00)
            createdoor(arg0, (arg0\Field40 + 2.1875), arg0\Field3, (arg0\Field37 - 1.0625), 180.0, $00, $00, $05, $00, $00)
            createdoor(arg0, (arg0\Field40 + 2.1875), arg0\Field3, (arg0\Field37 + 1.0625), 180.0, $00, $00, $05, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 3.1875), arg0\Field3, arg0\Field37, 270.0, $00, $07, $05, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 + 3.1875), arg0\Field3, arg0\Field37, 90.0, $00, $07, $05, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            For local25 = $00 To $03 Step $01
                Select local25
                    Case $00
                        local12 = 560.0
                        local14 = -416.0
                    Case $01
                        local12 = -560.0
                        local14 = -416.0
                    Case $02
                        local12 = 560.0
                        local14 = 416.0
                    Case $03
                        local12 = -560.0
                        local14 = 416.0
                End Select
                local2 = createsecuritycam(arg0, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + 1.507812), (arg0\Field37 + (local14 * (1.0 / 256.0))), 30.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
                local2\Field20 = (180.0 * (Float (local25 < $02)))
                local2\Field8 = 30.0
            Next
            For local25 = $00 To $0E Step $01
                Select local25
                    Case $00
                        local12 = -64.0
                        local14 = -516.0
                    Case $01
                        local12 = -96.0
                        local14 = -388.0
                    Case $02
                        local12 = -128.0
                        local14 = -292.0
                    Case $03
                        local12 = -128.0
                        local14 = -132.0
                    Case $04
                        local12 = -160.0
                        local14 = -36.0
                    Case $05
                        local12 = -192.0
                        local14 = 28.0
                    Case $06
                        local12 = -384.0
                        local14 = 28.0
                    Case $07
                        local12 = -448.0
                        local14 = 92.0
                    Case $08
                        local12 = -480.0
                        local14 = 124.0
                    Case $09
                        local12 = -512.0
                        local14 = 156.0
                    Case $0A
                        local12 = -544.0
                        local14 = 220.0
                    Case $0B
                        local12 = -544.0
                        local14 = 380.0
                    Case $0C
                        local12 = -544.0
                        local14 = 476.0
                    Case $0D
                        local12 = -544.0
                        local14 = 572.0
                    Case $0E
                        local12 = -544.0
                        local14 = 636.0
                End Select
                local3 = createdecal(rand($11, $12), (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + 0.005), (arg0\Field37 + (local14 * (1.0 / 256.0))), 90.0, rnd(360.0, 0.0), 0.0, ((rnd(0.2, 0.25) * (Float (local25 <= $0A))) + (rnd(0.1, 0.17) * (Float (local25 > $0A)))), 1.0, $00, $01, $00, $00, $00)
                entityparent(local3\Field0, arg0\Field15, $01)
            Next
            local7 = createitem("SCP-714", $19, (arg0\Field40 - 2.1875), (arg0\Field3 + 1.386719), (arg0\Field37 - 2.96875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-1025", $1E, (arg0\Field40 + 2.1875), (arg0\Field3 + (1.0 / 1.383784)), (arg0\Field37 - 2.96875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-860", $1C, (arg0\Field40 + 2.1875), (arg0\Field3 + (1.0 / 1.383784)), (arg0\Field37 + 2.988281), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-427", $00, (arg0\Field40 - 2.375), (arg0\Field3 + 0.125), (arg0\Field37 + 2.484375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-714", $00, (arg0\Field40 - 2.84375), (arg0\Field3 + 1.132812), (arg0\Field37 - 1.40625), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-860", $00, (arg0\Field40 + 2.84375), (arg0\Field3 + 1.132812), (arg0\Field37 + 1.40625), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $19
            local0 = createdoor(arg0, (arg0\Field40 + 1.125), arg0\Field3, (arg0\Field37 + 2.25), 90.0, $00, $00, $06, $00, $00)
            local0\Field21 = $01
            arg0\Field25[$00] = local0
            createdoor(arg0, (arg0\Field40 + 3.0625), arg0\Field3, (arg0\Field37 + 2.625), 90.0, $00, $00, $06, $00, $00)
            createdoor(arg0, (arg0\Field40 + 2.171875), arg0\Field3, (arg0\Field37 + 1.125), 0.0, $00, $00, $06, $00, $00)
            createdoor(arg0, (arg0\Field40 - (1.0 / 1.04065)), arg0\Field3, (arg0\Field37 + 0.8125), 270.0, $01, $06, $00, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 4.0), arg0\Field3, (arg0\Field37 - (1.0 / 0.64)), 270.0, $00, $07, $04, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 2.25), (arg0\Field3 + 0.625), (arg0\Field37 + 2.46875), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            For local25 = $00 To $01 Step $01
                Select local25
                    Case $00
                        local12 = 850.0
                        local13 = 385.0
                        local14 = 876.0
                    Case $01
                        local12 = 616.0
                        local13 = 512.0
                        local14 = 150.0
                End Select
                local2 = createsecuritycam(arg0, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + (local13 * (1.0 / 256.0))), (arg0\Field37 + (local14 * (1.0 / 256.0))), 30.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
                local2\Field20 = (220.0 - ((Float local25) * 40.0))
                local2\Field8 = 30.0
            Next
            local7 = createitem("Syringe", $55, (arg0\Field40 - 2.847656), (arg0\Field3 + 0.53125), (arg0\Field37 + 2.921875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-914", $00, (arg0\Field40 - 2.617188), (arg0\Field3 + 0.53125), (arg0\Field37 - 2.898438), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Note from Nobody #2", $00, (arg0\Field40 - 3.472656), (arg0\Field3 + 0.53125), (arg0\Field37 + 1.609375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-1499", $22, (arg0\Field40 + 2.40625), (arg0\Field3 + (1.0 / 1.376344)), (arg0\Field37 - (1.0 / 1.094017)), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-1499", $00, (arg0\Field40 + 3.269531), (arg0\Field3 + 1.015625), (arg0\Field37 + (1.0 / 1.21327)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Emily Ross' Badge", $03, (arg0\Field40 + 1.421875), (arg0\Field3 + (1.0 / 51.2)), (arg0\Field37 + 2.796875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-500", $00, (arg0\Field40 + 3.480469), (arg0\Field3 + 0.890625), (arg0\Field37 + 1.894531), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-500", $13, (arg0\Field40 + 4.480469), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 + 1.347656), $00, $00, $00, 1.0, $00)
            local26 = rand($09, $01)
            For local25 = $00 To (local7\Field36 - $01) Step $01
                local8 = createitem("SCP-500-01", $14, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                local8\Field18 = local7\Field27
                local8\Field17 = $01
                local8\Field30 = $FFFFFFFF
                local7\Field8[local25] = local8
                hideentity(local8\Field9)
                If (local25 = local26) Then
                    Exit
                EndIf
            Next
            setanimtime(local7\Field5, max(0.0, (11.0 - (Float local26))), $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $1A
            local0 = createdoor(arg0, (arg0\Field40 + 1.375), arg0\Field3, (arg0\Field37 - 2.5), 90.0, $00, $00, $00, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 + 3.5625), arg0\Field3, (arg0\Field37 + 2.125), 0.0, $01, $07, $04, $00, $00)
            rotateentity(local0\Field40[$00], 0.0, 270.0, 0.0, $01)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.015), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.4), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 1.06), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 0.031), $01)
            local1 = createdoor(arg0, (arg0\Field40 + 3.5625), arg0\Field3, (arg0\Field37 + 1.125), 0.0, $00, $07, $04, $00, $00)
            positionentity(local1\Field40[$00], (entityx(local1\Field40[$00], $01, 1.0) - 0.06), entityy(local1\Field40[$00], $01, 1.0), (entityz(local1\Field40[$00], $01, 1.0) + 0.031), $01)
            freeentity(local1\Field40[$01])
            local1\Field40[$01] = $00
            local0\Field26 = local1
            local1\Field26 = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.375), (arg0\Field3 + 19.00391), (arg0\Field37 - 2.5), 90.0, $00, $00, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 3.5625), (arg0\Field3 + 19.00391), (arg0\Field37 + 2.125), 0.0, $01, $07, $04, $00, $00)
            rotateentity(local0\Field40[$00], 0.0, 270.0, 0.0, $01)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.015), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.4), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 1.06), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 0.031), $01)
            arg0\Field25[$01] = local0
            local1 = createdoor(arg0, (arg0\Field40 + 3.5625), (arg0\Field3 + 19.00391), (arg0\Field37 + 1.125), 0.0, $00, $07, $04, $00, $00)
            positionentity(local1\Field40[$00], (entityx(local1\Field40[$00], $01, 1.0) - 0.06), entityy(local1\Field40[$00], $01, 1.0), (entityz(local1\Field40[$00], $01, 1.0) + 0.031), $01)
            freeentity(local1\Field40[$01])
            local1\Field40[$01] = $00
            arg0\Field25[$02] = local1
            local0\Field26 = local1
            local1\Field26 = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.3125), (arg0\Field3 + 19.00391), (arg0\Field37 + 2.78125), 90.0, $00, $05, $00, $00, $00)
            local0\Field21 = $02
            local0\Field47 = $00
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.3125), (arg0\Field3 + 19.00391), (arg0\Field37 + 0.65625), 270.0, $00, $05, $00, $00, $00)
            arg0\Field25[$04] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 2.609375), (arg0\Field3 + 19.00391), (arg0\Field37 - 2.75), 0.0, $00, $05, $00, $00, $00)
            arg0\Field25[$05] = local0
            local0 = createdoor(arg0, arg0\Field40, (arg0\Field3 + 19.00391), (arg0\Field37 + 1.625), 0.0, $00, $05, $00, $00, $00)
            local0\Field21 = $02
            local0\Field47 = $00
            arg0\Field25[$06] = local0
            local0 = createdoor(arg0, arg0\Field40, (arg0\Field3 + 19.00391), (arg0\Field37 - 3.691406), 0.0, $00, $05, $00, $00, $00)
            local0\Field21 = $02
            local0\Field47 = $00
            arg0\Field25[$07] = local0
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 3.195312), (arg0\Field3 + 19.32031), (arg0\Field37 + 2.875), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            local3 = createdecal($06, (arg0\Field40 - 2.148438), ((arg0\Field3 + 19.00391) + 0.005), (arg0\Field37 + 2.21875), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.4, 0.5), rnd(0.8, 1.0), $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($04, (arg0\Field40 + 0.703125), ((arg0\Field3 + 19.00391) + 0.005), (arg0\Field37 + 3.113281), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.6, 0.7), rnd(0.8, 1.0), $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local7 = createitem("Document SCP-1123", $00, (arg0\Field40 + 2.117188), (arg0\Field3 + (1.0 / 2.048)), (arg0\Field37 - 3.65625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Gas Mask", $38, (arg0\Field40 + 2.378906), (arg0\Field3 + (1.0 / 1.706667)), (arg0\Field37 + 3.753906), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (key2_spawnrate = $06) Then
                local7 = createitem("White Key", $68, (arg0\Field40 + 4.144531), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 0.625), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local7 = createitem("SCP-1123", $21, (arg0\Field40 + 3.5625), (arg0\Field3 + 1.40625), (arg0\Field37 + 3.347656), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local6 = setemitter(arg0, (arg0\Field40 + 3.558594), (arg0\Field3 + 1.492188), (arg0\Field37 + 1.625), $19)
            local6\Field7 = $02
            local6 = setemitter(arg0, (arg0\Field40 + 3.558594), (arg0\Field3 + 17.49219), (arg0\Field37 + 1.625), $19)
            local6\Field7 = $02
        Case $1C
            createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 2.082031), 0.0, $00, $06, $00, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 1.0), arg0\Field3, (arg0\Field37 + 2.8125), 90.0, $00, $07, $03, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.15), $01)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 3.449219), (arg0\Field3 + 0.59375), (arg0\Field37 + 2.566406), 90.0, $00)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - 3.5), (arg0\Field3 + 0.640625), (arg0\Field37 + 2.25), 90.0, $00)
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 - 1.265625), (arg0\Field3 + 0.53125), (arg0\Field37 + 3.65625))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $1D
            local0 = createdoor(arg0, (arg0\Field40 + 3.183594), arg0\Field3, (arg0\Field37 - 1.375), 180.0, $00, $07, $FFFFFFFE, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) + 0.07), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.07), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            local0 = createdoor(arg0, (arg0\Field40 + 1.375), arg0\Field3, (arg0\Field37 - 3.183594), 90.0, $00, $07, $FFFFFFFE, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.07), $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.07), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 2.875), arg0\Field3, (arg0\Field37 - (1.0 / 3.2)), 180.0, $00, $07, $00, $00, $00)
            local0\Field10 = $00
            local0\Field33 = $15E
            positionentity(local0\Field40[$00], (arg0\Field40 - 2.1875), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - 2.46875), $01)
            rotateentity(local0\Field40[$00], 0.0, 0.0, 0.0, $01)
            positionentity(local0\Field40[$01], (arg0\Field40 - 2.335938), (arg0\Field3 + (1.0 / 1.174312)), (arg0\Field37 - 1.914062), $01)
            rotateentity(local0\Field40[$01], 0.0, 90.0, 0.0, $01)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + (1.0 / 3.2)), arg0\Field3, (arg0\Field37 + 2.875), 90.0, $00, $07, $00, $00, $00)
            local0\Field10 = $00
            local0\Field33 = $15E
            positionentity(local0\Field40[$00], (arg0\Field40 + 2.46875), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 + 2.1875), $01)
            rotateentity(local0\Field40[$00], 0.0, 90.0, 0.0, $01)
            positionentity(local0\Field40[$01], (arg0\Field40 + 0.703125), (arg0\Field3 + (1.0 / 1.174312)), (arg0\Field37 + 2.335938), $01)
            rotateentity(local0\Field40[$01], 0.0, 0.0, 0.0, $01)
            arg0\Field25[$01] = local0
            arg0\Field25[$00]\Field26 = arg0\Field25[$01]
            arg0\Field25[$01]\Field26 = arg0\Field25[$00]
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $1D) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], $00)
                        arg0\Field27[$01] = copyentity(local4\Field27[$01], $00)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadmesh_strict("GFX\Map\Props\ventilation_grate.b3d", $00, $01)
            EndIf
            scaleentity(arg0\Field27[$00], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 2.5625), (arg0\Field3 + 1.46875), (arg0\Field37 + 1.75), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            If (arg0\Field27[$01] = $00) Then
                arg0\Field27[$01] = loadrmesh("GFX\Map\room2C_gw_lcz_blinds.rmesh", Null, $00)
            EndIf
            local12 = (1.0 / 3.324675)
            local13 = 0.515625
            local14 = 1.175781
            positionentity(arg0\Field27[$01], (arg0\Field40 + local12), arg0\Field3, (arg0\Field37 + local14), $00)
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            rotateentity(arg0\Field27[$01], 0.0, 90.0, 0.0, $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + local12), (arg0\Field3 + local13), (arg0\Field37 + local14), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = copyentity(arg0\Field27[$01], $00)
            local12 = -1.175781
            local14 = (1.0 / -3.324675)
            positionentity(arg0\Field27[$03], (arg0\Field40 + local12), arg0\Field3, (arg0\Field37 + local14), $00)
            scaleentity(arg0\Field27[$03], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            rotateentity(arg0\Field27[$03], 0.0, 0.0, 0.0, $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = createpivot($00)
            positionentity(arg0\Field27[$04], (arg0\Field40 + local12), (arg0\Field3 + local13), (arg0\Field37 + local14), $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + (1.0 / 1.024)), (arg0\Field3 + 0.875), (arg0\Field37 + 2.285156), 0.0, $01)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 + 1.25), (arg0\Field3 + 0.875), (arg0\Field37 + 2.285156), 0.0, $00)
            arg0\Field9[$02] = createlever(arg0, (arg0\Field40 - 2.285156), (arg0\Field3 + 0.875), (arg0\Field37 - 1.640625), 90.0, $01)
            arg0\Field9[$03] = createlever(arg0, (arg0\Field40 - 2.285156), (arg0\Field3 + 0.875), (arg0\Field37 - 1.367188), 90.0, $00)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 2.6875), (arg0\Field3 + 1.5), (arg0\Field37 + 2.6875), 40.0, $01, (arg0\Field40 + 2.617188), (arg0\Field3 + 1.09375), (arg0\Field37 - 0.375), 0.0, 90.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 45.0
            local2 = createsecuritycam(arg0, (arg0\Field40 - 0.4375), (arg0\Field3 + 1.5), (arg0\Field37 + 0.4375), 40.0, $01, (arg0\Field40 + 0.375), (arg0\Field3 + 1.09375), (arg0\Field37 - 2.617188), 0.0, 0.0, 0.0)
            local2\Field20 = 45.0
            local2\Field8 = 45.0
            createcustomcenter(arg0, (arg0\Field40 - 2.875), (arg0\Field37 - 1.375))
        Case $1E
            local0 = createdoor(arg0, (arg0\Field40 + 3.183594), arg0\Field3, (arg0\Field37 - 1.375), 180.0, $01, $07, $FFFFFFFE, $00, $00)
            local0\Field47 = $00
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) + 0.07), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.07), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            local0 = createdoor(arg0, (arg0\Field40 + 1.375), arg0\Field3, (arg0\Field37 - 3.183594), 90.0, $01, $07, $FFFFFFFE, $00, $00)
            local0\Field47 = $00
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.07), $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.07), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 2.875), arg0\Field3, (arg0\Field37 - (1.0 / 3.2)), 180.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            positionentity(local0\Field40[$00], (arg0\Field40 - 1.125), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - 2.46875), $01)
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            local0 = createdoor(arg0, (arg0\Field40 + (1.0 / 3.2)), arg0\Field3, (arg0\Field37 + 2.875), 90.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            positionentity(local0\Field40[$00], (arg0\Field40 + 2.46875), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 + 1.125), $01)
            rotateentity(local0\Field40[$00], 0.0, 90.0, 0.0, $01)
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            createcustomcenter(arg0, (arg0\Field40 + 3.183594), (arg0\Field37 - 3.183594))
        Case $1F
            local0 = createdoor(arg0, (arg0\Field40 + 0.96875), arg0\Field3, (arg0\Field37 - 2.875), 90.0, $00, $00, $04, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.031), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.031), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 1.125), 0.0, $01, $00, $05, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.132), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 2.375), arg0\Field3, (arg0\Field37 + 1.125), 0.0, $01, $00, $05, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.032), $01)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 3.925781), (arg0\Field3 + 0.5), (arg0\Field37 - 2.4375), $00)
            entityradius(arg0\Field27[$00], 0.1, 0.0)
            entitypickmode(arg0\Field27[$00], $01, $01)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 0.75), (arg0\Field3 + 2.75), (arg0\Field37 + 0.75), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 45.0
            local7 = createitem("Document SCP-1162-ARC", $00, (arg0\Field40 + 2.938387), (arg0\Field3 + 0.59375), (arg0\Field37 - 1.167969), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-066", $00, (arg0\Field40 + 1.328125), (arg0\Field3 + 0.59375), (arg0\Field37 - (1.0 / 1.089362)), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 240.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Incident Report SCP-066-2", $00, (arg0\Field40 - (1.0 / 12.19048)), (arg0\Field3 + 0.875), (arg0\Field37 + 3.230469), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("S-NAV Navigator", $49, (arg0\Field40 - (1.0 / 1.062241)), (arg0\Field3 + 0.59375), (arg0\Field37 + 3.148438), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Gas Mask", $38, (arg0\Field40 + 2.304688), (arg0\Field3 + (1.0 / 5.12)), (arg0\Field37 - 1.222656), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 30.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 2.546875), (arg0\Field3 + (1.0 / 5.12)), (arg0\Field37 - 1.328125))
            entityparent(local7\Field9, arg0\Field15, $01)
            If (key2_spawnrate = $04) Then
                local7 = createitem("White Key", $68, (arg0\Field40 + 2.082031), (arg0\Field3 + (1.0 / 1.706667)), (arg0\Field37 + 1.460938), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $21
            createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 2.082031), 180.0, $00, $06, $00, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 1.0), arg0\Field3, (arg0\Field37 + 2.8125), 90.0, $00, $07, $03, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.15), $01)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 3.449219), (arg0\Field3 + 0.59375), (arg0\Field37 + 2.566406), 90.0, $00)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - 3.5), (arg0\Field3 + 0.640625), (arg0\Field37 + 2.25), 90.0, $00)
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 - 1.265625), (arg0\Field3 + 0.53125), (arg0\Field37 + 3.65625))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $20
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 1.75), 0.0, $01, $01, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 22.8125), (arg0\Field3 - 22.0), (arg0\Field37 + 4.0625), 0.0, $00, $01, $00, $00, $00)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 2.375), arg0\Field3, (arg0\Field37 - 1.195312), 180.0, $01, $01, $00, $00, $00)
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.78125), (arg0\Field3 - 22.0), (arg0\Field37 - 3.1875), 180.0, $00, $01, $00, $00, $00)
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 0.21875), (arg0\Field3 - 22.0), (arg0\Field37 + 24.60938), 90.0, $00, $02, $00, $00, $00)
            local0\Field10 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$04] = local0
            createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, arg0\Field37, 90.0, $00, $00, $FFFFFFFF, $00, $00)
            createdoor(arg0, (arg0\Field40 - (1.0 / 1.044898)), arg0\Field3, (arg0\Field37 - 2.058594), 270.0, $00, $06, $00, $00, $00)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + 12.09375), (arg0\Field3 - 21.34375), (arg0\Field37 + 25.66016), 0.0, $00)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 + 4.75), (arg0\Field3 - 21.34375), (arg0\Field37 + 12.65625), 0.0, $00)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], arg0\Field40, (arg0\Field3 + 0.9375), (arg0\Field37 + 2.9375), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 22.8125), ((arg0\Field3 - 22.0) + 0.9375), (arg0\Field37 + 5.25), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 2.375), (arg0\Field3 + 0.9375), (arg0\Field37 - 2.382812), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 - 1.78125), ((arg0\Field3 - 22.0) + 0.9375), (arg0\Field37 - 4.375), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = createpivot($00)
            positionentity(arg0\Field27[$04], (arg0\Field40 + 8.417969), (arg0\Field3 - 21.67969), (arg0\Field37 + 7.679688), $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            arg0\Field27[$05] = createpivot($00)
            positionentity(arg0\Field27[$05], (arg0\Field40 + 8.417969), (arg0\Field3 - 21.67969), (arg0\Field37 - 3.78125), $00)
            entityparent(arg0\Field27[$05], arg0\Field15, $01)
            arg0\Field27[$06] = createpivot($00)
            positionentity(arg0\Field27[$06], (arg0\Field40 + 15.54688), (arg0\Field3 - 21.67969), (arg0\Field37 - 3.78125), $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
            arg0\Field27[$07] = createpivot($00)
            positionentity(arg0\Field27[$07], (arg0\Field40 + 15.54688), (arg0\Field3 - 21.67969), (arg0\Field37 + 7.679688), $00)
            entityparent(arg0\Field27[$07], arg0\Field15, $01)
            arg0\Field27[$08] = createpivot($00)
            positionentity(arg0\Field27[$08], (arg0\Field40 + 2.214844), (arg0\Field3 - 21.67969), (arg0\Field37 + 20.21875), $00)
            entityparent(arg0\Field27[$08], arg0\Field15, $01)
            arg0\Field27[$09] = createpivot($00)
            positionentity(arg0\Field27[$09], (arg0\Field40 + 2.214844), (arg0\Field3 - 21.67969), (arg0\Field37 + 24.89453), $00)
            entityparent(arg0\Field27[$09], arg0\Field15, $01)
            arg0\Field27[$0A] = createpivot($00)
            positionentity(arg0\Field27[$0A], (arg0\Field40 + 11.48438), (arg0\Field3 - 21.67969), (arg0\Field37 + 24.89453), $00)
            entityparent(arg0\Field27[$0A], arg0\Field15, $01)
            arg0\Field27[$0B] = createpivot($00)
            positionentity(arg0\Field27[$0B], (arg0\Field40 + 11.48438), (arg0\Field3 - 21.67969), (arg0\Field37 + 20.21875), $00)
            entityparent(arg0\Field27[$0B], arg0\Field15, $01)
            arg0\Field27[$0C] = createpivot($00)
            positionentity(arg0\Field27[$0C], (arg0\Field40 + 4.230469), (arg0\Field3 - 21.67969), (arg0\Field37 + 11.80859), $00)
            entityparent(arg0\Field27[$0C], arg0\Field15, $01)
            arg0\Field27[$0D] = createpivot($00)
            positionentity(arg0\Field27[$0D], (arg0\Field40 + 4.230469), (arg0\Field3 - 21.67969), (arg0\Field37 + 4.609375), $00)
            entityparent(arg0\Field27[$0D], arg0\Field15, $01)
            arg0\Field27[$0E] = createpivot($00)
            positionentity(arg0\Field27[$0E], (arg0\Field40 - 1.78125), (arg0\Field3 - 21.67969), (arg0\Field37 + 4.609375), $00)
            entityparent(arg0\Field27[$0E], arg0\Field15, $01)
            arg0\Field27[$0F] = createpivot($00)
            positionentity(arg0\Field27[$0F], (arg0\Field40 - 1.78125), (arg0\Field3 - 21.67969), (arg0\Field37 + 11.80859), $00)
            entityparent(arg0\Field27[$0F], arg0\Field15, $01)
            arg0\Field27[$11] = loadrmesh("GFX\Map\elevator.rmesh", Null, $00)
            scaleentity(arg0\Field27[$11], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$11], (arg0\Field40 + 16.01172), (arg0\Field3 - 18.99219), (arg0\Field37 - 7.167969), $00)
            rotateentity(arg0\Field27[$11], 0.0, 0.0, 0.0, $00)
            entityparent(arg0\Field27[$11], arg0\Field15, $01)
            arg0\Field27[$12] = createbutton($04, (arg0\Field40 + 15.42969), (arg0\Field3 - 21.27344), (arg0\Field37 - 5.839844), 0.0, 180.0, 0.0, arg0\Field15, $01, $01)
            local6 = setemitter(arg0, (arg0\Field40 + 20.48828), (arg0\Field3 - 21.8125), (arg0\Field37 - 2.246094), $06)
            local6\Field7 = $01
            Select rand($03, $01)
                Case $01
                    local12 = 4674.0
                    local14 = 950.0
                Case $02
                    local12 = 3032.0
                    local14 = 1288.0
                Case $03
                    local12 = 2938.0
                    local14 = 2793.0
            End Select
            local7 = createitem("Device Document", $00, (arg0\Field40 - 1.609375), (arg0\Field3 + 0.546875), (arg0\Field37 - 2.890625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Black Severed Hand", $65, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 - 21.46875), (arg0\Field37 + (local14 * (1.0 / 256.0))), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Bloody Level 1 Key Card", $5A, (arg0\Field40 + 13.16406), (arg0\Field3 - 21.46875), (arg0\Field37 + 24.22266), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Night Vision Goggles", $40, (arg0\Field40 + 4.875), (arg0\Field3 - 21.46875), (arg0\Field37 + 3.832031), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(0.0, 1000.0)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Radio Transceiver", $45, (arg0\Field40 - 2.597656), (arg0\Field3 + (1.0 / 1.620253)), (arg0\Field37 - 2.878906), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(100.0, 0.0)
            entityparent(local7\Field9, arg0\Field15, $01)
            local3 = createdecal($03, (arg0\Field40 + (local12 * (1.0 / 256.0))), ((arg0\Field3 - 22.0) + 0.005), (arg0\Field37 + (local14 * (1.0 / 256.0))), 90.0, rnd(360.0, 0.0), 0.0, 0.5, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($03, (arg0\Field40 + 13.42969), (arg0\Field3 - 21.52344), (arg0\Field37 + 24.58594), 0.0, 270.0, 0.0, 0.3, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($07, (arg0\Field40 + 4.230469), ((arg0\Field3 - 22.0) + 0.005), (arg0\Field37 + 3.476562), 90.0, 180.0, 0.0, 0.5, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
        Case $24
            local0 = createdoor(arg0, (arg0\Field40 + 2.25), arg0\Field3, (arg0\Field37 + 0.6875), 90.0, $00, $03, $04, $00, $00)
            positionentity(local0\Field40[$00], (arg0\Field40 + 1.898438), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - 1.15625), $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.025), $01)
            turnentity(local0\Field40[$00], 0.0, 90.0, 0.0, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + (1.0 / 2.534653)), arg0\Field3, (arg0\Field37 + 1.484375), 90.0, $01, $00, $04, $00, $00)
            local0\Field47 = $00
            local0\Field10 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 3.28125), arg0\Field3, (arg0\Field37 + 1.007812), 180.0, $00, $07, $04, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.08), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local7 = createitem("Document SCP-372", $00, (arg0\Field40 + 1.367188), (arg0\Field3 + 0.6875), (arg0\Field37 + 2.203125), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Radio Transceiver", $45, (arg0\Field40 + (1.0 / 1.376344)), (arg0\Field3 + 0.4375), (arg0\Field37 - 1.667969), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(100.0, 0.0)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 + 2.75), arg0\Field37)
        Case $45
            local0 = createdoor(arg0, (arg0\Field40 - 2.75), arg0\Field3, (arg0\Field37 + 1.0), 0.0, $00, $00, $05, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 2.0), arg0\Field3, (arg0\Field37 + 2.429688), 90.0, $01, $00, $05, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) + 0.031), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            For local25 = $00 To $02 Step $01
                Select local25
                    Case $00
                        local12 = -87.0
                        local14 = 466.0
                        local24 = rnd(0.1, 0.2)
                    Case $01
                        local12 = -177.0
                        local14 = 467.0
                        local24 = rnd(0.2, 0.3)
                End Select
                local3 = createdecal($00, (arg0\Field40 + (local12 * (1.0 / 256.0))), ((arg0\Field3 + (local13 * (1.0 / 256.0))) + 0.005), (arg0\Field37 + (local14 * (1.0 / 256.0))), 90.0, rnd(360.0, 0.0), 0.0, local24, rnd(0.6, 0.8), $01, $01, $00, $00, $00)
                entityparent(local3\Field0, arg0\Field15, $01)
            Next
            local2 = createsecuritycam(arg0, (arg0\Field40 - 3.699219), (arg0\Field3 + 1.5), (arg0\Field37 + (1.0 / 1.406593)), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 240.0
            local2\Field8 = 15.0
            local7 = createitem("SCP-513", $17, (arg0\Field40 - (1.0 / 6.095238)), (arg0\Field3 + (1.0 / 1.590062)), (arg0\Field37 + 2.480469), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 10.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Blood-stained Note", $00, (arg0\Field40 + 1.53125), (arg0\Field3 + (1.0 / 1.969231)), (arg0\Field37 - 1.09375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-513", $00, (arg0\Field40 - 1.242188), (arg0\Field3 + 0.40625), (arg0\Field37 - 1.40625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Wallet", $2E, (arg0\Field40 - 3.625), (arg0\Field3 + (1.0 / 1.706667)), (arg0\Field37 + 1.648438), $00, $00, $00, 1.0, $00)
            local7\Field20 = local7\Field6\Field14
            setanimtime(local7\Field5, 4.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local8 = createitem("Mastercard", $61, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
            local8\Field17 = $01
            local8\Field30 = $FFFFFFFF
            local8\Field15 = (Float rand($00, $06))
            local8\Field18 = local7\Field27
            local7\Field8[$00] = local8
            hideentity(local8\Field9)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 2.5))
        Case $27
            local0 = createdoor(arg0, (arg0\Field40 + 2.75), arg0\Field3, (arg0\Field37 - 1.3125), 0.0, $00, $04, $FFFFFFFA, $00, $00)
            local0\Field21 = $01
            local2 = createsecuritycam(arg0, (arg0\Field40 + 1.25), (arg0\Field3 + 2.125), (arg0\Field37 - 1.25), 30.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field11 = $01
            arg0\Field27[$00] = copyentity(mon_i\Field3[$01], arg0\Field15)
            positionentity(arg0\Field27[$00], (arg0\Field40 - 2.734375), (arg0\Field3 + 1.5), (arg0\Field37 + 1.132812), $01)
            scaleentity(arg0\Field27[$00], 2.0, 2.0, 2.0, $00)
            rotateentity(arg0\Field27[$00], 0.0, 0.0, 0.0, $00)
            local7 = createitem("Note from Nobody #1", $00, (arg0\Field40 - 1.097656), (arg0\Field3 + 0.625), (arg0\Field37 + 2.34375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Clipboard", $2D, (arg0\Field40 + 3.589844), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.339844), $00, $00, $00, 1.0, $00)
            local7\Field20 = local7\Field6\Field14
            setanimtime(local7\Field5, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local8 = createitem("Document SCP-1048", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
            local8\Field18 = local7\Field27
            local8\Field17 = $01
            local8\Field30 = $FFFFFFFF
            local7\Field8[$00] = local8
            hideentity(local8\Field9)
            local8 = createitem("Level 2 Key Card", $5B, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
            local8\Field18 = local7\Field27
            local8\Field17 = $01
            local8\Field30 = $FFFFFFFF
            local7\Field8[$01] = local8
            hideentity(local8\Field9)
        Case $28
            local0 = createdoor(arg0, (arg0\Field40 + (1.0 / 1.28)), arg0\Field3, arg0\Field37, 0.0, $00, $00, $05, $00, $00)
            local0\Field33 = $15E
            positionentity(local0\Field40[$00], arg0\Field40, entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - (1.0 / 1.179724)), $01)
            positionentity(local0\Field40[$01], arg0\Field40, entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 + (1.0 / 1.179724)), $01)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - (1.0 / 1.28)), arg0\Field3, arg0\Field37, 0.0, $00, $00, $05, $00, $00)
            local0\Field33 = $15E
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$01] = local0
            arg0\Field25[$00]\Field26 = arg0\Field25[$01]
            arg0\Field25[$01]\Field26 = arg0\Field25[$00]
            If (currmapgrid\Field4[(Int (floor((arg0\Field40 / 8.0)) + ((floor((arg0\Field37 / 8.0)) - 1.0) * (Float X824BX6D68))))] = $00) Then
                local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 4.007812), 0.0, $00, $02, $00, $00, $00)
                local0\Field21 = $01
                local0\Field41 = $01
                local0\Field47 = $00
                freeentity(local0\Field40[$00])
                local0\Field40[$00] = $00
            EndIf
            arg0\Field27[$00] = copyentity(mon_i\Field3[$01], arg0\Field15)
            positionentity(arg0\Field27[$00], arg0\Field40, (arg0\Field3 + 1.5), (arg0\Field37 + 1.0), $01)
            scaleentity(arg0\Field27[$00], 2.0, 2.0, 2.0, $00)
            rotateentity(arg0\Field27[$00], 0.0, 180.0, 0.0, $00)
            arg0\Field27[$01] = copyentity(mon_i\Field3[$01], arg0\Field15)
            positionentity(arg0\Field27[$01], arg0\Field40, (arg0\Field3 + 1.5), (arg0\Field37 - 1.0), $01)
            scaleentity(arg0\Field27[$01], 2.0, 2.0, 2.0, $00)
            rotateentity(arg0\Field27[$01], 0.0, 0.0, 0.0, $00)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 0.75), (arg0\Field3 + 2.75), (arg0\Field37 + 3.75), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 0.0
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 + (1.0 / 0.512)))
        Case $2A
            local0 = createdoor(arg0, (arg0\Field40 - 1.15625), arg0\Field3, (arg0\Field37 - 2.625), 180.0, $01, $07, $07, $00, $00)
            local0\Field10 = $00
            local0\Field21 = $01
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            positionentity(local0\Field40[$01], (arg0\Field40 - 0.640625), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.15625), arg0\Field3, (arg0\Field37 - 0.5625), 0.0, $00, $07, $07, $00, $00)
            local0\Field10 = $00
            local0\Field21 = $01
            positionentity(local0\Field40[$00], (arg0\Field40 - 1.710938), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - 1.875), $01)
            rotateentity(local0\Field40[$00], 0.0, 90.0, 0.0, $01)
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            affectdecaydoor(local0)
            arg0\Field25[$01] = local0
            arg0\Field25[$00]\Field26 = arg0\Field25[$01]
            arg0\Field25[$01]\Field26 = arg0\Field25[$00]
            local0 = createdoor(arg0, (arg0\Field40 + 1.5), arg0\Field3, (arg0\Field37 - 2.625), 180.0, $00, $00, $07, $00, $00)
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 3.0), arg0\Field3, (arg0\Field37 + 2.0), 90.0, $00, $00, $00, $1663, $00)
            arg0\Field25[$03] = local0
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + (1.0 / 1.22488)), (arg0\Field3 + 0.875), (arg0\Field37 - (1.0 / 1.24878)), -270.0, $00)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 + (1.0 / 1.22488)), (arg0\Field3 + 0.875), (arg0\Field37 - 0.515625), -270.0, $00)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 1.78125), (arg0\Field3 + 0.5), (arg0\Field37 + (1.0 / 0.64)), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 - 2.25), (arg0\Field3 + 0.5), (arg0\Field37 + 2.5), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 - 2.8125), (arg0\Field3 + 0.5), (arg0\Field37 + 3.4375), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 + 0.6875), (arg0\Field3 + 0.5), (arg0\Field37 - 0.5625), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = loadmesh_strict("GFX\Map\Props\SCPlabel.b3d", $00, $01)
            update035label(arg0\Field27[$04])
            scaleentity(arg0\Field27[$04], (1.0 / 5.12), (1.0 / 5.12), (1.0 / 10.24), $00)
            rotateentity(arg0\Field27[$04], 0.0, 180.0, 0.0, $00)
            positionentity(arg0\Field27[$04], (arg0\Field40 - (1.0 / 8.533334)), (arg0\Field3 + (1.0 / 1.113043)), (arg0\Field37 - 2.75), $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            local7 = createitem("SCP-035 Addendum", $00, (arg0\Field40 + 2.683594), (arg0\Field3 + 0.9375), (arg0\Field37 + (1.0 / 2.015748)), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Radio Transceiver", $45, (arg0\Field40 - 2.125), (arg0\Field3 + 0.5), (arg0\Field37 + 2.75), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-500-01", $14, (arg0\Field40 + 4.5625), (arg0\Field3 + (1.0 / 1.003922)), (arg0\Field37 + 2.25), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Metal Panel", $0A, (arg0\Field40 - 1.40625), (arg0\Field3 + 0.5), (arg0\Field37 + 2.515625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-035", $00, (arg0\Field40 + 4.5625), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 + 1.59375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 3.3125))
        Case $2B
            local0 = createdoor(arg0, (arg0\Field40 - 6.4375), (arg0\Field3 - 19.75), (arg0\Field37 + 4.804688), 90.0, $00, $03, $06, $00, $00)
            positionentity(local0\Field40[$00], (arg0\Field40 - 7.398438), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 + 6.542969), $01)
            rotateentity(local0\Field40[$00], 0.0, (entityyaw(local0\Field40[$00], $01, 1.0) + 180.0), 0.0, $01)
            positionentity(local0\Field40[$01], (arg0\Field40 - 5.539062), entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 + 6.101562), $01)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 2.0), arg0\Field3, (arg0\Field37 - 1.0), -90.0, $01, $01, $00, $00, $00)
            positionentity(local0\Field24[$01], entityx(local0\Field24[$01], $01, 1.0), (entityy(local0\Field24[$01], $01, 1.0) + 0.05), entityz(local0\Field24[$01], $01, 1.0), $01)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 2.0), (arg0\Field3 - 18.0), (arg0\Field37 - 1.0), -90.0, $00, $01, $00, $00, $00)
            arg0\Field25[$02] = local0
            createdoor(arg0, (arg0\Field40 - 4.695312), (arg0\Field3 - 19.75), (arg0\Field37 + 3.40625), 0.0, $00, $00, $FFFFFFFF, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 1.015625), (arg0\Field3 - 20.75), (arg0\Field37 + 6.484375), 90.0, $00, $06, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 0.25), 0.0, $00, $02, $06, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            local0\Field41 = $01
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            arg0\Field27[$00] = loadanimmesh_strict("GFX\Map\Props\scp_079.b3d", $00, $01)
            arg0\Field30[$00] = $01
            positionentity(arg0\Field27[$00], (arg0\Field40 + (1.0 / 1.542169)), (arg0\Field3 - 20.1875), (arg0\Field37 + 6.273438), $00)
            scaleentity(arg0\Field27[$00], 1.3, 1.3, 1.3, $00)
            rotateentity(arg0\Field27[$00], 0.0, -90.0, 0.0, $01)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            hideentity(arg0\Field27[$00])
            arg0\Field27[$01] = createsprite(arg0\Field27[$00])
            arg0\Field30[$01] = $01
            spriteviewmode(arg0\Field27[$01], $02)
            positionentity(arg0\Field27[$01], 0.082, 0.119, 0.01, $00)
            scalesprite(arg0\Field27[$01], 0.09, 0.0725)
            turnentity(arg0\Field27[$01], 0.0, 13.0, 0.0, $00)
            moveentity(arg0\Field27[$01], 0.0, 0.0, -0.022, $00)
            GUESSEDcreatesurface(arg0\Field27[$01], $00, $FFFFFFFF)
            hideentity(arg0\Field27[$01])
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 3.1875), (arg0\Field3 + 0.9375), (arg0\Field37 - 1.0), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 + 3.1875), ((arg0\Field3 - 18.0) + 0.9375), (arg0\Field37 - 1.0), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 1.0))
        Case $2C
            local0 = createdoor(arg0, (arg0\Field40 - 2.75), arg0\Field3, (arg0\Field37 - 2.75), 90.0, $01, $01, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 2.75), (arg0\Field3 - 28.625), (arg0\Field37 - 2.75), 90.0, $00, $01, $00, $00, $00)
            arg0\Field25[$01] = local0
            createdoor(arg0, (arg0\Field40 - (1.0 / 1.438202)), (arg0\Field3 - 28.625), (arg0\Field37 - 1.648438), 0.0, $00, $00, $06, $00, $00)
            createdoor(arg0, (arg0\Field40 - 4.453125), (arg0\Field3 - 31.64062), (arg0\Field37 + 6.300781), 180.0, $00, $00, $06, $00, $00)
            createdoor(arg0, (arg0\Field40 - 2.976562), (arg0\Field3 - 33.625), (arg0\Field37 + (1.0 / 5.019608)), 90.0, $00, $00, $06, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 + 1.5), arg0\Field3, (arg0\Field37 - 2.75), 90.0, $00, $02, $06, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            local0 = createdoor(arg0, (arg0\Field40 - 1.125), (arg0\Field3 - 28.625), (arg0\Field37 - 6.257812), 0.0, $00, $02, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            local0 = createdoor(arg0, (arg0\Field40 + 2.703125), (arg0\Field3 - 33.59375), (arg0\Field37 + 1.558594), 0.0, $00, $06, $00, $00, $00)
            local0\Field21 = $02
            local0\Field41 = $01
            local0\Field47 = $00
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 2.90625), (arg0\Field3 - 30.89062), (arg0\Field37 + 12.19922), 0.0, $01)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - 2.597656), (arg0\Field3 - 30.89062), (arg0\Field37 + 12.19922), 0.0, $00)
            local2 = createsecuritycam(arg0, (arg0\Field40 + 3.0), (arg0\Field3 - 23.1875), (arg0\Field37 + 6.375), 45.0, $01, (arg0\Field40 - 1.804688), (arg0\Field3 - 30.75), (arg0\Field37 + 12.12891), 0.0, -10.0, 0.0)
            local2\Field20 = 315.0
            local2\Field8 = 20.0
            local2\Field10 = $01
            hideentity(local2\Field0)
            arg0\Field2[$00] = local2
            local2 = createsecuritycam(arg0, (arg0\Field40 - 5.621094), (arg0\Field3 - 29.9375), (arg0\Field37 + 6.675781), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 315.0
            local2\Field8 = 30.0
            arg0\Field27[$00] = createbutton($00, (arg0\Field40 - 1.316406), (arg0\Field3 - 30.875), (arg0\Field37 + 12.25), 0.0, 0.0, 0.0, arg0\Field15, $00, $01)
            arg0\Field27[$01] = loadrmesh("GFX\Map\cont1_106_box.rmesh", Null, $00)
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 2.703125), (arg0\Field3 - 32.45312), (arg0\Field37 + 4.03125), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 - 3.9375), (arg0\Field3 + 0.9375), (arg0\Field37 - 2.75), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 - 3.9375), ((arg0\Field3 - 28.625) + 0.9375), (arg0\Field37 - 2.75), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = loadmesh_strict("GFX\Map\cont1_106_hb.b3d", arg0\Field15, $01)
            arg0\Field30[$04] = $01
            entitypickmode(arg0\Field27[$04], $02, $01)
            entityalpha(arg0\Field27[$04], 0.0)
            arg0\Field27[$05] = loadanimmesh_strict("GFX\Map\Props\femur_breaker.b3d", $00, $01)
            local24 = (1.0 / 3938.462)
            scaleentity(arg0\Field27[$05], local24, local24, local24, $00)
            positionentity(arg0\Field27[$05], (arg0\Field40 + 4.238281), (arg0\Field3 - 25.0), (arg0\Field37 + 7.550781), $00)
            rotateentity(arg0\Field27[$05], 0.0, 180.0, 0.0, $00)
            entityparent(arg0\Field27[$05], arg0\Field15, $01)
            local7 = createitem("Dr. Allok's Note", $00, (arg0\Field40 - (1.0 / 2.942529)), (arg0\Field3 - 30.875), (arg0\Field37 + 9.902344), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Recall Protocol RP-106-N", $00, (arg0\Field40 - 3.863281), (arg0\Field3 - 31.28125), (arg0\Field37 + 12.13672), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Headphones", $7E, (arg0\Field40 - 2.128906), (arg0\Field3 - 30.78125), (arg0\Field37 + 9.894531), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Brian Skinner's Badge", $03, (arg0\Field40 + 2.0), (arg0\Field3 - 33.59375), (arg0\Field37 - 2.40625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 - 0.515625), (arg0\Field37 - 2.75))
        Case $2D
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 1.75), 0.0, $00, $03, $04, $00, $00)
            positionentity(local0\Field40[$00], (arg0\Field40 - 1.523438), entityy(local0\Field40[local25], $01, 1.0), (arg0\Field37 - 1.09375), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.025), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.628906), arg0\Field3, arg0\Field37, 90.0, $01, $00, $04, $00, $00)
            arg0\Field25[$01] = local0
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 3.125), (arg0\Field3 + 0.703125), (arg0\Field37 - 1.324219), 180.0, $01)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], arg0\Field40, (arg0\Field3 - 5.984375), (arg0\Field37 + 9.796875), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            For local25 = $00 To $05 Step $01
                Select local25
                    Case $00
                        local12 = -667.0
                        local14 = 105.0
                        local24 = rnd(0.4, 0.5)
                    Case $01
                        local12 = -679.0
                        local14 = 157.0
                        local24 = rnd(0.4, 0.5)
                    Case $02
                        local12 = -542.0
                        local14 = 138.0
                        local24 = rnd(0.6, 0.7)
                    Case $03
                        local12 = -636.0
                        local14 = 204.0
                        local24 = rnd(0.1, 0.2)
                    Case $04
                        local12 = -819.0
                        local14 = 261.0
                        local24 = rnd(0.6, 0.7)
                    Case $05
                        local12 = -672.0
                        local14 = 299.0
                        local24 = rnd(0.7, 0.8)
                End Select
                local3 = createdecal($00, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + 0.005), (arg0\Field37 + (local14 * (1.0 / 256.0))), 90.0, rnd(360.0, 0.0), 0.0, local24, rnd(0.6, 0.8), $01, $01, $00, $00, $00)
                entityparent(local3\Field0, arg0\Field15, $01)
            Next
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.25), (arg0\Field3 + 2.75), (arg0\Field37 + 1.125), 120.06, $01, (arg0\Field40 - 3.125), (arg0\Field3 + 1.125), (arg0\Field37 - 1.328125), 0.0, 180.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 45.0
            local2\Field2 = $01
            sc_i\Field2 = local2
            local7 = createitem("Document SCP-895", $00, (arg0\Field40 - 2.316406), (arg0\Field3 + 0.125), (arg0\Field37 + (1.0 / 3.282051)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Night Vision Goggles", $40, (arg0\Field40 + 1.09375), (arg0\Field3 - 5.6875), (arg0\Field37 + 8.453125), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(0.0, 1000.0)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $2F
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 1.4375), arg0\Field3, arg0\Field37, $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 - 1.4375), arg0\Field3, arg0\Field37, $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], ((arg0\Field40 + 0.875) - 0.005), (arg0\Field3 + 0.75), arg0\Field37, $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], ((arg0\Field40 - 0.875) + 0.005), (arg0\Field3 + 0.75), arg0\Field37, $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
        Case $31
            local0 = createdoor(arg0, (arg0\Field40 + 3.0), arg0\Field3, (arg0\Field37 - 3.232422), 90.0, $00, $02, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.1), $01)
            createdoor(arg0, (arg0\Field40 + 1.945312), arg0\Field3, (arg0\Field37 - 2.464844), 0.0, $00, $07, $FFFFFFFF, $00, $00)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + 2.9375), (arg0\Field3 + (1.0 / 1.398907)), (arg0\Field37 - (1.0 / 16.0)), 270.0, $01)
        Case $33
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $33) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], $00)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadmesh_strict("GFX\Map\Props\ventilation_grate.b3d", $00, $01)
            EndIf
            scaleentity(arg0\Field27[$00], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$00], arg0\Field40, (arg0\Field3 + 1.71875), arg0\Field37, $00)
            entitytype(arg0\Field27[$00], $01, $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
        Case $34
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $34) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], $00)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadanimmesh_strict("GFX\Map\Props\scp_789_j.b3d", $00, $01)
            EndIf
            local24 = (1.0 / 102.4)
            scaleentity(arg0\Field27[$00], local24, local24, local24, $00)
            entitytype(arg0\Field27[$00], $01, $00)
            rotateentity(arg0\Field27[$00], 0.0, -90.0, 0.0, $00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 1.460938), arg0\Field3, (arg0\Field37 - 3.242188), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            If (rand($03, $01) = $01) Then
                Select rand($04, $01)
                    Case $01
                        local12 = 862.0
                        local14 = 885.0
                    Case $02
                        local12 = 862.0
                        local14 = 701.0
                    Case $03
                        local12 = 862.0
                        local14 = -697.0
                    Case $04
                        local12 = 862.0
                        local14 = -880.0
                End Select
                local6 = setemitter(arg0, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + (1.0 / 1.815603)), (arg0\Field37 + (local14 * (1.0 / 256.0))), $11)
                local6\Field7 = $03
            EndIf
        Case $35
            local0 = createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, (arg0\Field37 + 2.5625), -90.0, $01, $01, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.0), arg0\Field3, (arg0\Field37 - 2.5625), 90.0, $01, $01, $00, $00, $00)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.0), (arg0\Field3 - 49.86719), (arg0\Field37 + 2.5625), 90.0, $00, $01, $00, $00, $00)
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.96875), (arg0\Field3 - 49.86719), (arg0\Field37 - 4.1875), 90.0, $00, $01, $00, $00, $00)
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, arg0\Field37, 0.0, $00, $02, $00, code_maintenance_tunnels, $00)
            affectdecaydoor(local0)
            createdoor(arg0, (arg0\Field40 - 0.46875), (arg0\Field3 - 49.86719), (arg0\Field37 - 2.25), 0.0, $00, $02, $00, code_maintenance_tunnels, $00)
            createdoor(arg0, (arg0\Field40 + 8.875), (arg0\Field3 - 49.86719), (arg0\Field37 + 7.0), 90.0, $00, $02, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 + 14.75), (arg0\Field3 - 49.86719), (arg0\Field37 - 1.0), 90.0, $00, $02, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 + 31.5), (arg0\Field3 - 49.83594), (arg0\Field37 + 3.53125), 0.0, $01, $02, $06, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 + 5.25), (arg0\Field3 - 49.86719), (arg0\Field37 + 5.640625), 0.0, $00, $02, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            local0 = createdoor(arg0, (arg0\Field40 + 29.0625), (arg0\Field3 - 49.86719), (arg0\Field37 - 1.0), 90.0, $00, $02, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 2.1875), (arg0\Field3 + 0.9375), (arg0\Field37 + 2.5625), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 - 2.1875), (arg0\Field3 + 0.9375), (arg0\Field37 - 2.5625), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 2.1875), (arg0\Field3 - 48.92969), (arg0\Field37 + 2.5625), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 - 3.15625), (arg0\Field3 - 48.92969), (arg0\Field37 - 4.1875), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = loadrmesh("GFX\Map\ventilation_fan.rmesh", Null, $00)
            local24 = (1.0 / 465.4545)
            scaleentity(arg0\Field27[$04], local24, local24, local24, $00)
            positionentity(arg0\Field27[$04], (arg0\Field40 + 12.625), (arg0\Field3 - 49.4375), (arg0\Field37 + 0.171875), $00)
            rotateentity(arg0\Field27[$04], 0.0, 270.0, 0.0, $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            arg0\Field27[$05] = copyentity(arg0\Field27[$04], $00)
            scaleentity(arg0\Field27[$05], local24, local24, local24, $00)
            positionentity(arg0\Field27[$05], (arg0\Field40 + 12.625), (arg0\Field3 - 48.5), (arg0\Field37 + 0.171875), $00)
            rotateentity(arg0\Field27[$05], 0.0, 270.0, 0.0, $00)
            entityparent(arg0\Field27[$05], arg0\Field15, $01)
            arg0\Field27[$06] = copyentity(arg0\Field27[$04], $00)
            scaleentity(arg0\Field27[$06], local24, local24, local24, $00)
            positionentity(arg0\Field27[$06], (arg0\Field40 + 0.5), (arg0\Field3 - 48.5), (arg0\Field37 - 8.046875), $00)
            rotateentity(arg0\Field27[$06], 0.0, 90.0, 0.0, $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
            arg0\Field27[$07] = copyentity(arg0\Field27[$04], $00)
            scaleentity(arg0\Field27[$07], local24, local24, local24, $00)
            positionentity(arg0\Field27[$07], (arg0\Field40 + 0.5), (arg0\Field3 - 49.4375), (arg0\Field37 - 8.046875), $00)
            rotateentity(arg0\Field27[$07], 0.0, 90.0, 0.0, $00)
            entityparent(arg0\Field27[$07], arg0\Field15, $01)
            local24 = (1.0 / 142.2222)
            arg0\Field27[$08] = copyentity(arg0\Field27[$04], $00)
            scaleentity(arg0\Field27[$08], local24, local24, local24, $00)
            positionentity(arg0\Field27[$08], (arg0\Field40 - 0.4375), (arg0\Field3 - 46.40625), (arg0\Field37 + 7.0), $00)
            rotateentity(arg0\Field27[$08], 0.0, 0.0, 270.0, $00)
            entityparent(arg0\Field27[$08], arg0\Field15, $01)
            arg0\Field27[$09] = copyentity(arg0\Field27[$04], $00)
            scaleentity(arg0\Field27[$09], local24, local24, local24, $00)
            positionentity(arg0\Field27[$09], (arg0\Field40 + 14.28125), (arg0\Field3 - 44.84375), (arg0\Field37 + 8.335938), $00)
            rotateentity(arg0\Field27[$09], 0.0, 0.0, 270.0, $00)
            entityparent(arg0\Field27[$09], arg0\Field15, $01)
            GUESSEDcreateentity_14(arg0, (arg0\Field40 + 28.1875), (arg0\Field3 - 48.55469), (arg0\Field37 + 6.699219), 80.0, $FF, $32, $32, 0.0, 90.0, 0.0, 3.0, 50.0, 0.5, $00)
            GUESSEDcreateentity_14(arg0, (arg0\Field40 + 36.16406), (arg0\Field3 - 48.47656), (arg0\Field37 + 5.097656), 60.0, $FF, $32, $32, 0.0, 90.0, 0.0, 3.0, 50.0, 0.5, $00)
            GUESSEDcreateentity_14(arg0, (arg0\Field40 + 36.16406), (arg0\Field3 - 48.47656), (arg0\Field37 + 4.652344), 60.0, $FF, $32, $32, 0.0, 90.0, 0.0, 3.0, 50.0, 0.5, $00)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + 31.8125), (arg0\Field3 - 49.02344), (arg0\Field37 - (1.0 / 12.19048)), 180.0, $00)
            local6 = setemitter(arg0, (arg0\Field40 + 26.33203), (arg0\Field3 - 49.51562), (arg0\Field37 - 1.726562), $26)
            local6\Field7 = $04
            local3 = createdecal($00, (arg0\Field40 + 0.25), (arg0\Field3 + 0.005), (arg0\Field37 + 0.5625), 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($18, (arg0\Field40 + 30.61719), ((arg0\Field3 - 49.83594) + 0.005), (arg0\Field37 + 2.832031), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.4, 0.6), 0.8, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($18, (arg0\Field40 + 25.58984), ((arg0\Field3 - 49.83594) + 0.005), (arg0\Field37 + 4.847656), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.4, 0.6), 0.8, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local12 = (arg0\Field40 + 34.48438)
            local13 = ((arg0\Field3 - 49.9375) + 0.005)
            local14 = (arg0\Field37 + 2.410156)
            local3 = createdecal($16, local12, local13, local14, 90.0, rnd(360.0, 0.0), 0.0, rnd(0.8, 1.0), 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($01, (arg0\Field40 + 34.78125), local13, (arg0\Field37 + 0.515625), 90.0, rnd(360.0, 0.0), 0.0, 3.0, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            setemitter(arg0, local12, (local13 + 2.757812), local14, $27)
            setemitter(arg0, local12, local13, (local14 + 0.005), $28)
            local7 = createitem("Document SCP-457", $00, (arg0\Field40 + 2.535156), (arg0\Field3 - 49.16016), (arg0\Field37 - 1.894531), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Scorched Note", $00, (arg0\Field40 + 0.25), (arg0\Field3 + 0.125), (arg0\Field37 + 1.007812), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Level 4 Key Card", $5D, (arg0\Field40 + 32.84375), (arg0\Field3 - 49.34375), (arg0\Field37 + 1.101562), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Logan Burton's Badge", $03, (arg0\Field40 + 31.39844), (arg0\Field3 - 49.46094), (arg0\Field37 + 1.234375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Newspaper", $00, (arg0\Field40 + 5.113281), (arg0\Field3 - 49.26562), (arg0\Field37 - (1.0 / 1.190698)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-500-01", $14, (arg0\Field40 + 7.136719), (arg0\Field3 - 48.94141), (arg0\Field37 - (1.0 / 1.79021)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Fine Hazmat Suit", $3D, (arg0\Field40 + 29.29688), (arg0\Field3 - 49.26562), (arg0\Field37 + 1.390625), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Night Vision Goggles", $40, (arg0\Field40 + 9.148438), (arg0\Field3 - 49.89453), (arg0\Field37 + 15.97266), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(0.0, 1000.0)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 7.121094), (arg0\Field3 - 49.16016), (arg0\Field37 - 1.539062))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Heavy Gas Mask", $3B, (arg0\Field40 + 34.36719), (arg0\Field3 - 19.83594), (arg0\Field37 + 3.601562), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 2.5625))
        Case $36
            local0 = createdoor(arg0, (arg0\Field40 + 4.6875), arg0\Field3, arg0\Field37, -90.0, $01, $01, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 4.6875), (arg0\Field3 - 40.1875), arg0\Field37, -90.0, $00, $01, $00, $00, $00)
            arg0\Field25[$01] = local0
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 1.941406), (arg0\Field3 - 39.375), (arg0\Field37 - 2.160156), -270.0, $01)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - 1.941406), (arg0\Field3 - 39.375), (arg0\Field37 - 1.644531), -270.0, $01)
            local0 = createdoor(arg0, (arg0\Field40 + 2.25), arg0\Field3, arg0\Field37, 90.0, $00, $02, $07, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.09), $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.09), $01)
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 0.125), (arg0\Field3 - 40.1875), (arg0\Field37 + 2.703125), 90.0, $00, $02, $07, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.075), $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.075), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 1.125), (arg0\Field3 - 40.1875), (arg0\Field37 + 3.5), 180.0, $00, $02, $07, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 5.875), (arg0\Field3 + 0.9375), arg0\Field37, $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 5.875), ((arg0\Field3 - 40.1875) + 0.9375), arg0\Field37, $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = loadrmesh("GFX\Map\room2_nuke_vent.rmesh", Null, $01)
            scaleentity(arg0\Field27[$02], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            rotateentity(arg0\Field27[$02], 90.0, 0.0, 0.0, $01)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 3.46875), (arg0\Field3 + (1.0 / 9.846154)), (arg0\Field37 + 1.25), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = copyentity(arg0\Field27[$02], $00)
            scaleentity(arg0\Field27[$03], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            rotateentity(arg0\Field27[$03], 90.0, 180.0, 0.0, $01)
            positionentity(arg0\Field27[$03], (arg0\Field40 + 3.46875), (arg0\Field3 + (1.0 / 9.846154)), (arg0\Field37 - 1.25), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            local7 = createitem("Nuclear Device Document", $00, (arg0\Field40 - 1.8125), (arg0\Field3 - 39.60156), (arg0\Field37 - 2.773438), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Ballistic Vest", $27, (arg0\Field40 - 0.96875), (arg0\Field3 - 39.60156), (arg0\Field37 - 3.195312), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, -90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Victor Rosewood's Badge", $04, (arg0\Field40 + 1.707031), (arg0\Field3 + 0.125), (arg0\Field37 + 1.027344), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local2 = createsecuritycam(arg0, (arg0\Field40 + 4.378906), (arg0\Field3 - 38.28516), (arg0\Field37 - 1.195312), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 90.0
            local2\Field8 = 45.0
        Case $37
            local0 = createdoor(arg0, (arg0\Field40 - 0.875), arg0\Field3, (arg0\Field37 - 2.875), 90.0, $01, $00, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 0.875), arg0\Field3, (arg0\Field37 + 2.875), 90.0, $01, $00, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$01] = local0
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 4.921875), (arg0\Field3 + (1.0 / 1.094017)), (arg0\Field37 + 2.941406), 0.0, $00)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - 3.582031), (arg0\Field3 + 0.640625), (arg0\Field37 + 3.511719), 0.0, $00)
            arg0\Field9[$02] = createlever(arg0, (arg0\Field40 - 3.269531), (arg0\Field3 + 0.59375), (arg0\Field37 + 3.464844), 0.0, $00)
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, arg0\Field37, 0.0, $00, $02, $00, $00, $00)
            local0\Field21 = $01
            arg0\Field27[$00] = loadmesh_strict("GFX\Map\room2_servers_hcz_hb.b3d", arg0\Field15, $01)
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entityalpha(arg0\Field27[$00], 0.0)
            hideentity(arg0\Field27[$00])
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 2.953125))
        Case $38
            createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, (arg0\Field37 + 2.90625), 90.0, $00, $00, $03, $00, $00)
            createdoor(arg0, (arg0\Field40 + 6.058594), arg0\Field3, (arg0\Field37 + 1.9375), 0.0, $00, $00, $00, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 + 7.75), arg0\Field3, (arg0\Field37 + 2.90625), 90.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 6.058594), arg0\Field3, (arg0\Field37 + (1.0 / 1.098712)), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createbutton($04, (arg0\Field40 + 4.609375), (arg0\Field3 + 0.703125), (arg0\Field37 - 2.15625), 0.0, 270.0, 0.0, arg0\Field15, $01, $01)
            arg0\Field27[$02] = loadrmesh("GFX\Map\elevator.rmesh", Null, $00)
            scaleentity(arg0\Field27[$02], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 6.011719), (arg0\Field3 - 3.863281), (arg0\Field37 - 1.5), $00)
            rotateentity(arg0\Field27[$02], 0.0, 180.0, 0.0, $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = loadmesh_strict("GFX\Map\Props\elevator_cable.b3d", $00, $01)
            scaleentity(arg0\Field27[$03], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$03], (arg0\Field40 + 6.003906), (arg0\Field3 - 3.085938), (arg0\Field37 - 1.839844), $00)
            rotateentity(arg0\Field27[$03], 0.0, 0.0, 0.0, $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = copyentity(arg0\Field27[$03], $00)
            scaleentity(arg0\Field27[$04], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$04], (arg0\Field40 + 5.839844), (arg0\Field3 - 2.914062), (arg0\Field37 - 1.621094), $00)
            rotateentity(arg0\Field27[$04], 0.0, 0.0, 0.0, $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            arg0\Field27[$05] = copyentity(arg0\Field27[$03], $00)
            scaleentity(arg0\Field27[$05], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$05], (arg0\Field40 + 6.167969), (arg0\Field3 - 2.914062), (arg0\Field37 - 1.621094), $00)
            rotateentity(arg0\Field27[$05], 0.0, 0.0, 0.0, $00)
            entityparent(arg0\Field27[$05], arg0\Field15, $01)
            arg0\Field27[$06] = copyentity(arg0\Field27[$03], $00)
            scaleentity(arg0\Field27[$06], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$06], (arg0\Field40 + 5.839844), (arg0\Field3 - 2.914062), (arg0\Field37 - 1.371094), $00)
            rotateentity(arg0\Field27[$06], 0.0, 0.0, 0.0, $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
            arg0\Field27[$07] = copyentity(arg0\Field27[$03], $00)
            scaleentity(arg0\Field27[$07], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$07], (arg0\Field40 + 6.167969), (arg0\Field3 - 2.914062), (arg0\Field37 - 1.371094), $00)
            rotateentity(arg0\Field27[$07], 0.0, 0.0, 0.0, $00)
            entityparent(arg0\Field27[$07], arg0\Field15, $01)
            arg0\Field27[$08] = copyentity(arg0\Field27[$03], $00)
            scaleentity(arg0\Field27[$08], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$08], (arg0\Field40 + 6.003906), (arg0\Field3 - 3.085938), (arg0\Field37 - 1.152344), $00)
            rotateentity(arg0\Field27[$08], 0.0, 0.0, 0.0, $00)
            entityparent(arg0\Field27[$08], arg0\Field15, $01)
            local7 = createitem("Level 2 Key Card", $5B, (arg0\Field40 + 3.867188), (arg0\Field3 + (1.0 / 1.098712)), (arg0\Field37 + 1.683594), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("First Aid Kit", $34, (arg0\Field40 + 4.042969), (arg0\Field3 + (1.0 / 1.765517)), (arg0\Field37 + 0.21875), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 7.539062), (arg0\Field3 + (1.0 / 2.639175)), (arg0\Field37 + 1.0))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 4.441406), (arg0\Field3 + (1.0 / 1.590062)), (arg0\Field37 + 1.6875))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + 7.539062), (arg0\Field3 + (1.0 / 1.137778)), (arg0\Field37 + 0.5), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Note from Nobody #4", $00, (arg0\Field40 + 3.890625), (arg0\Field3 + 0.625), (arg0\Field37 - (1.0 / 2.509804)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $3A
            local0 = createdoor(arg0, (arg0\Field40 + 2.8125), arg0\Field3, arg0\Field37, 0.0, $00, $02, $FFFFFFFD, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 2.4375), (arg0\Field3 - 5.0), arg0\Field37, 90.0, $01, $02, $00, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.031), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.031), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field25[$01] = local0
            For local12 = 0.0 To 1.0 Step 1.0
                For local14 = -1.0 To 1.0 Step 1.0
                    arg0\Field27[(Int ((local12 * 3.0) + (local14 + 1.0)))] = createpivot($00)
                    positionentity(arg0\Field27[(Int ((local12 * 3.0) + (local14 + 1.0)))], (arg0\Field40 + (((280.0 * local12) + -236.0) * (1.0 / 256.0))), (arg0\Field3 - 2.734375), (arg0\Field37 + ((384.0 * local14) * (1.0 / 256.0))), $00)
                    entityparent(arg0\Field27[(Int ((local12 * 3.0) + (local14 + 1.0)))], arg0\Field15, $01)
                Next
            Next
            arg0\Field27[$06] = createpivot($00)
            positionentity(arg0\Field27[$06], (arg0\Field40 + 2.945312), (arg0\Field3 - 4.875), arg0\Field37, $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
            arg0\Field27[$07] = loadmesh_strict("GFX\Map\room2_test_hcz_hb.b3d", arg0\Field15, $01)
            arg0\Field30[$07] = $01
            entitypickmode(arg0\Field27[$07], $02, $01)
            entityalpha(arg0\Field27[$07], 0.0)
            local2 = createsecuritycam(arg0, (arg0\Field40 + 2.90625), (arg0\Field3 - 3.34375), (arg0\Field37 + 0.921875), 0.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field11 = $01
            local7 = createitem("Document SCP-682", $00, (arg0\Field40 + 2.5625), (arg0\Field3 - 4.6875), (arg0\Field37 - (1.0 / 16.0)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 3.1875))
        Case $3B
            local0 = createdoor(arg0, (arg0\Field40 - 0.375), (arg0\Field3 - 36.9375), (arg0\Field37 - 1.5), 180.0, $00, $07, $06, $00, $00)
            local0\Field10 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.08), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 0.375), (arg0\Field3 - 36.9375), (arg0\Field37 + 1.0), 0.0, $01, $07, $06, $00, $00)
            local0\Field10 = $00
            positionentity(local0\Field40[$00], (arg0\Field40 + (1.0 / 3.657143)), entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - 0.09375), $01)
            rotateentity(local0\Field40[$00], 0.0, -90.0, 0.0, $01)
            arg0\Field25[$01] = local0
            arg0\Field25[$00]\Field26 = arg0\Field25[$01]
            arg0\Field25[$01]\Field26 = arg0\Field25[$00]
            local0 = createdoor(arg0, (arg0\Field40 - 1.78125), (arg0\Field3 - 36.9375), (arg0\Field37 - 3.0), 0.0, $00, $00, $06, $00, $00)
            local0\Field21 = $01
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 3.1875), (arg0\Field3 - 36.9375), (arg0\Field37 - 1.5), 0.0, $00, $00, $06, $00, $00)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.08), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            local0\Field21 = $01
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.75), arg0\Field3, arg0\Field37, -90.0, $01, $01, $00, $00, $00)
            arg0\Field25[$04] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.75), (arg0\Field3 - 36.9375), arg0\Field37, -90.0, $00, $01, $00, $00, $00)
            arg0\Field25[$05] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 0.375), (arg0\Field3 - 36.9375), (arg0\Field37 - 2.25), 90.0, $00, $00, $00, $00, $00)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.08), $01)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 - (1.0 / 4.129032)), (arg0\Field3 - 36.47266), (arg0\Field37 + 3.472656), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = loadrmesh("GFX\Map\scp_008_lid.rmesh", Null, $00)
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$01], (arg0\Field40 - (1.0 / 4.129032)), (arg0\Field3 - 36.34375), (arg0\Field37 + 3.691406), $00)
            entityradius(arg0\Field27[$01], 0.5, 0.0)
            entitypickmode(arg0\Field27[$01], $01, $00)
            rotateentity(arg0\Field27[$01], 85.0, 0.0, 0.0, $01)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createsprite($00)
            arg0\Field30[$02] = $01
            local22 = loadtexture_strict("GFX\Map\Textures\glass.png", $03, $00, 1.0)
            textureblend(local22, $02)
            entitytexture(arg0\Field27[$02], local22, $00, $00)
            deletesingletextureentryfromcache(local22, $00)
            local22 = $00
            arg0\Field27[$03] = copyentity(arg0\Field27[$02], $00)
            For local25 = $02 To $03 Step $01
                spriteviewmode(arg0\Field27[local25], $02)
                scalesprite(arg0\Field27[local25], (1.0 / 2.639175), (1.0 / 2.639175))
                positionentity(arg0\Field27[local25], (arg0\Field40 - 2.5), (arg0\Field3 - 36.02734), (arg0\Field37 + 3.125), $00)
                turnentity(arg0\Field27[local25], 0.0, (90.0 + (Float ((local25 = $03) * $B4))), 0.0, $00)
                entityalpha(arg0\Field27[local25], 0.5)
                entityparent(arg0\Field27[local25], arg0\Field15, $01)
                GUESSEDcreatesurface(arg0\Field27[local25], $00, $40)
                hideentity(arg0\Field27[local25])
            Next
            arg0\Field27[$04] = createpivot($00)
            positionentity(arg0\Field27[$04], (arg0\Field40 - 3.203125), (arg0\Field3 - 36.47266), (arg0\Field37 + 2.566406), $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            arg0\Field16[$00] = addlight(arg0, (arg0\Field40 - 2.429688), (arg0\Field3 - 35.49609), (arg0\Field37 + 2.626953), $03, (100.0 * (Float local51)), $FF, $32, $32, $01, 0.1, $00)
            arg0\Field16[$00]\Field13 = $01
            arg0\Field16[$00]\Field17 = 0.4
            rotateentity(arg0\Field16[$00]\Field7, 30.0, 270.0, 0.0, $00)
            hideentity(arg0\Field16[$00]\Field7)
            arg0\Field27[$05] = createpivot($00)
            positionentity(arg0\Field27[$05], (arg0\Field40 + 2.9375), (arg0\Field3 + 0.9375), arg0\Field37, $00)
            entityparent(arg0\Field27[$05], arg0\Field15, $01)
            arg0\Field27[$06] = createpivot($00)
            positionentity(arg0\Field27[$06], (arg0\Field40 + 2.9375), ((arg0\Field3 - 36.9375) + 0.9375), arg0\Field37, $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
            local7 = createitem("Hazmat Suit", $3C, (arg0\Field40 - 2.179688), (arg0\Field3 - 36.12109), (arg0\Field37 - 0.25), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-008", $00, (arg0\Field40 - 3.6875), (arg0\Field3 - 36.5625), (arg0\Field37 + 2.625), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 - 3.671875), (arg0\Field3 - 36.35156), (arg0\Field37 + 3.140625))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Infected Syringe", $58, (arg0\Field40 - 3.199219), (arg0\Field3 - 36.375), (arg0\Field37 - 5.671875), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, -10.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("First Aid Kit", $34, (arg0\Field40 - (1.0 / 4.491228)), (arg0\Field3 - 36.03516), (arg0\Field37 - 3.652344), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local2 = createsecuritycam(arg0, (arg0\Field40 + 1.5), (arg0\Field3 - 35.17969), (arg0\Field37 + 4.5625), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 135.0
            local2\Field8 = 45.0
        Case $3C
            local0 = createdoor(arg0, (arg0\Field40 + 1.25), arg0\Field3, (arg0\Field37 + 2.5), -90.0, $01, $01, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 11.8125), (arg0\Field3 - 13.75), (arg0\Field37 + 7.125), -90.0, $00, $01, $00, $00, $00)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 2.625), arg0\Field3, (arg0\Field37 - 1.625), 0.0, $01, $01, $00, $00, $00)
            positionentity(local0\Field24[$01], entityx(local0\Field24[$01], $01, 1.0), (entityy(local0\Field24[$01], $01, 1.0) + 0.05), entityz(local0\Field24[$01], $01, 1.0), $01)
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 10.80469), (arg0\Field3 - 13.75), (arg0\Field37 - 6.25), 0.0, $00, $01, $00, $00, $00)
            positionentity(local0\Field24[$01], entityx(local0\Field24[$01], $01, 1.0), (entityy(local0\Field24[$01], $01, 1.0) + 0.05), entityz(local0\Field24[$01], $01, 1.0), $01)
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.0625), (arg0\Field3 - 13.875), (arg0\Field37 + 0.40625), 90.0, $01, $00, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$04] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.0625), (arg0\Field3 - 13.75), (arg0\Field37 - 7.125), 90.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$05] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.0625), (arg0\Field3 - 13.75), (arg0\Field37 + 7.125), 90.0, $01, $00, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$06] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.0625), (arg0\Field3 - 13.875), (arg0\Field37 + (1.0 / 2.612245)), -90.0, $00, $03, $05, $00, $00)
            local0\Field10 = $00
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.91), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) + 0.2), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.85), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 0.2), $01)
            rotateentity(local0\Field40[$00], 0.0, -90.0, 0.0, $01)
            rotateentity(local0\Field40[$01], 0.0, 90.0, 0.0, $01)
            arg0\Field25[$07] = local0
            createdoor(arg0, arg0\Field40, arg0\Field3, arg0\Field37, 0.0, $00, $02, $FFFFFFFE, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 3.5), arg0\Field3, (arg0\Field37 - 2.5), 90.0, $00, $02, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            local0 = createdoor(arg0, (arg0\Field40 - 10.80469), (arg0\Field3 - 13.75), (arg0\Field37 - 8.0), 0.0, $00, $02, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            local0 = createdoor(arg0, (arg0\Field40 + 10.625), (arg0\Field3 - 13.75), (arg0\Field37 + 8.0), 180.0, $00, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 4.435977), (arg0\Field3 - 13.875), (arg0\Field37 + (1.0 / 1.110904)), -90.0, $00, $07, $05, $00, $00)
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.02), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + 3.378906), (arg0\Field3 - 13.17969), (arg0\Field37 - 3.335938), 270.0, $00)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - 3.183594), (arg0\Field3 - 13.28125), (arg0\Field37 + 4.285156), 180.0, $00)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 2.4375), (arg0\Field3 + 0.9375), (arg0\Field37 + 2.5), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 13.0), ((arg0\Field3 - 13.75) + 0.9375), (arg0\Field37 + 7.125), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 - 2.625), (arg0\Field3 + 0.9375), (arg0\Field37 - 0.4375), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 - 10.80469), ((arg0\Field3 - 13.75) + 0.9375), (arg0\Field37 - 5.0625), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = createpivot($00)
            positionentity(arg0\Field27[$04], (arg0\Field40 - 3.25), (arg0\Field3 - 13.60938), (arg0\Field37 + 6.140625), $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            arg0\Field27[$05] = createbutton($00, (arg0\Field40 - 1.226562), (arg0\Field3 - 13.15625), (arg0\Field37 - 2.390625), 0.0, 270.0, 0.0, arg0\Field15, $00, $00)
            arg0\Field27[$06] = createpivot($00)
            positionentity(arg0\Field27[$06], (arg0\Field40 - 1.921875), (arg0\Field3 - 12.8125), (arg0\Field37 - 3.199219), $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
            local7 = createitem("Document SCP-049", $00, (arg0\Field40 - 3.285156), (arg0\Field3 - 13.29688), (arg0\Field37 - 3.382812), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Level 4 Key Card", $5D, (arg0\Field40 - 2.203125), (arg0\Field3 - 13.32812), (arg0\Field37 + 2.726562), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("First Aid Kit", $34, (arg0\Field40 + 1.503906), (arg0\Field3 - 13.32812), (arg0\Field37 + 1.058594), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 180.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 - 2.625), (arg0\Field37 - 2.5))
        Case $3D
            local0 = createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, (arg0\Field37 + 2.558594), -90.0, $01, $01, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.0), (arg0\Field3 - 8.871094), (arg0\Field37 + 2.558594), -90.0, $00, $01, $00, $00, $00)
            arg0\Field25[$01] = local0
            createdoor(arg0, (arg0\Field40 - 8.0625), (arg0\Field3 - 8.871094), (arg0\Field37 + 4.875), 90.0, $00, $00, $06, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 6.875), (arg0\Field3 - 8.871094), (arg0\Field37 + 10.4375), 0.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 6.875), (arg0\Field3 - 8.871094), (arg0\Field37 + 8.0625), 0.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.625), arg0\Field3, arg0\Field37, 270.0, $00, $02, $04, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            createdoor(arg0, (arg0\Field40 - 6.875), (arg0\Field3 - 8.871094), (arg0\Field37 + 12.3125), 0.0, (i_005\Field0 = $02), $00, $06, $00, $00)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 10.12891), (arg0\Field3 - 7.992188), (arg0\Field37 + 8.792969), 90.0, $01)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 2.1875), (arg0\Field3 + 0.9375), (arg0\Field37 + 2.5625), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 2.1875), ((arg0\Field3 - 8.871094) + 0.9375), (arg0\Field37 + 2.5625), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 - 9.082031), (arg0\Field3 - 9.082031), (arg0\Field37 + 15.15234), $00)
            entityradius(arg0\Field27[$02], 0.2, 0.0)
            entitypickmode(arg0\Field27[$02], $01, $01)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createbutton($01, (arg0\Field40 - 7.542969), (arg0\Field3 - 8.152344), (arg0\Field37 - 3.089844), 0.0, 180.0, 25.0, arg0\Field15, $01, $00)
            arg0\Field27[$04] = createpivot($00)
            positionentity(arg0\Field27[$04], (arg0\Field40 - 6.875), (arg0\Field3 - 8.746094), (arg0\Field37 + 9.25), $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            arg0\Field27[$05] = loadmesh_strict("GFX\Map\laser_grid_vertical.b3d", $00, $01)
            positionentity(arg0\Field27[$05], (arg0\Field40 - 7.742188), (arg0\Field3 - 8.046875), (arg0\Field37 + 9.25), $00)
            scaleentity(arg0\Field27[$05], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            entityparent(arg0\Field27[$05], arg0\Field15, $01)
            entityalpha(arg0\Field27[$05], 0.0)
            arg0\Field27[$06] = loadmesh_strict("GFX\Map\laser_grid_horizontal.b3d", $00, $01)
            positionentity(arg0\Field27[$06], (arg0\Field40 - 6.875), (arg0\Field3 - 8.871094), (arg0\Field37 + 9.25), $00)
            scaleentity(arg0\Field27[$06], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
            entityalpha(arg0\Field27[$06], 0.0)
            arg0\Field27[$07] = CreateLight($02, $00)
            arg0\Field30[$07] = $01
            LightRange(arg0\Field27[$07], (1.0 / 8.533334))
            LightColor(arg0\Field27[$07], $FF, $32, $32)
            GUESSEDcreatenpc_3(arg0\Field27[$07], $00)
            GUESSEDsetfillroom(arg0\Field27[$07], 1.65)
            positionentity(arg0\Field27[$07], (arg0\Field40 - 7.65625), (arg0\Field3 - 7.246094), (arg0\Field37 + 9.242188), $00)
            entityparent(arg0\Field27[$07], arg0\Field15, $01)
            hideentity(arg0\Field27[$07])
            arg0\Field27[$08] = CreateLight($02, $00)
            arg0\Field30[$08] = $01
            LightRange(arg0\Field27[$08], (1.0 / 8.533334))
            LightColor(arg0\Field27[$08], $FF, $32, $32)
            GUESSEDcreatenpc_3(arg0\Field27[$08], $00)
            GUESSEDsetfillroom(arg0\Field27[$08], 1.65)
            positionentity(arg0\Field27[$08], (arg0\Field40 - 6.09375), (arg0\Field3 - 7.246094), (arg0\Field37 + 9.242188), $00)
            entityparent(arg0\Field27[$08], arg0\Field15, $01)
            hideentity(arg0\Field27[$08])
            local2 = createsecuritycam(arg0, (arg0\Field40 - 4.074219), (arg0\Field3 - 7.25), (arg0\Field37 + 13.72266), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 100.0
            local2\Field8 = 45.0
            local7 = createitem("Containment Technologies", $00, (arg0\Field40 - 7.648438), (arg0\Field3 - 8.289062), (arg0\Field37 - (1.0 / 0.64)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 - 7.601562), (arg0\Field3 - 8.53125), (arg0\Field37 - 1.3125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 - 7.648438), (arg0\Field3 - 8.289062), (arg0\Field37 - 1.972656))
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $3E
            local6 = setemitter(arg0, (arg0\Field40 + 2.0), (arg0\Field3 - 0.296875), (arg0\Field37 - 2.6875), $03)
            local6\Field7 = $01
        Case $41
            createdoor(arg0, (arg0\Field40 - 0.234375), (arg0\Field3 - 2.375), (arg0\Field37 + 3.726562), 90.0, $00, $00, $05, $00, $00)
            createdoor(arg0, (arg0\Field40 + 1.015625), (arg0\Field3 - 2.375), (arg0\Field37 + 4.96875), 0.0, $00, $00, $05, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 6.855469), (arg0\Field3 - 2.375), (arg0\Field37 + 3.726562), 270.0, $00, $07, $05, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            local0\Field41 = $01
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local3 = createdecal($02, (arg0\Field40 - 4.734375), ((arg0\Field3 - 2.359375) + 0.005), (arg0\Field37 + 3.304688), 90.0, rnd(360.0, 0.0), 0.0, 0.8, 0.8, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($00, (arg0\Field40 - 4.859375), ((arg0\Field3 - 2.375) + 0.005), (arg0\Field37 + 2.226562), 90.0, rnd(360.0, 0.0), 0.0, 0.5, 0.5, $01, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local7 = createitem("Data Report", $00, (arg0\Field40 - 4.566406), (arg0\Field3 - 2.199219), (arg0\Field37 + 2.816406), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery(arg0\Field40, (arg0\Field3 - 1.738281), (arg0\Field37 + 5.957031))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-096", $00, (arg0\Field40 + (1.0 / 18.28572)), (arg0\Field3 - 1.523438), (arg0\Field37 + 5.613281), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCRAMBLE Gear", $43, (arg0\Field40 + (1.0 / 11.63636)), (arg0\Field3 - 1.875), (arg0\Field37 + 7.0625), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(0.0, 1000.0)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Dr. L's Note #2", $00, (arg0\Field40 - 0.625), (arg0\Field3 + 0.125), (arg0\Field37 - 1.378906), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local6 = setemitter(arg0, (arg0\Field40 + 2.0), (arg0\Field3 - 0.296875), (arg0\Field37 - 2.6875), $03)
            local6\Field7 = $01
            createcustomcenter(arg0, (arg0\Field40 + 1.328125), (arg0\Field37 - 1.328125))
        Case $42
            local6 = setemitter(arg0, (arg0\Field40 + 2.0), (arg0\Field3 - 0.296875), (arg0\Field37 - 2.6875), $03)
            local6\Field7 = $01
            local6 = setemitter(arg0, (arg0\Field40 - 2.0), (arg0\Field3 - 0.296875), (arg0\Field37 - 2.6875), $03)
            local6\Field7 = $01
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 1.660156))
        Case $73
            local0 = createdoor(arg0, (arg0\Field40 + 2.5), arg0\Field3, arg0\Field37, 270.0, $01, $02, $05, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 2.5), arg0\Field3, arg0\Field37, 270.0, $01, $02, $05, $00, $00)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 2.5), 0.0, $01, $02, $05, $00, $00)
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 3.25), arg0\Field3, (arg0\Field37 + 1.375), 0.0, $00, $07, $05, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.08), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.08), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 3.25), arg0\Field3, (arg0\Field37 + 1.375), 180.0, $00, $07, $05, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) + 0.08), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.08), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field25[$04] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 2.5625), arg0\Field3, (arg0\Field37 - 2.5625), 135.0, $00, $02, $00, $00, $00)
            local0\Field21 = $01
            local0 = createdoor(arg0, (arg0\Field40 - 1.25), arg0\Field3, (arg0\Field37 - 3.25), 270.0, $00, $02, $FFFFFFFD, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) + 0.08), $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 0.08), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 3.25), arg0\Field3, (arg0\Field37 - 1.25), 0.0, $00, $02, $FFFFFFFD, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.08), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.08), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + 0.921875), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 + 2.941406), 0.0, $00)
            arg0\Field16[$00] = addlight(arg0, (arg0\Field40 + 1.400391), (arg0\Field3 + (1.0 / 1.386031)), (arg0\Field37 + 2.960938), $02, (1.0 / 17.06667), $FF, $32, $32, $01, 0.1, $00)
            arg0\Field16[$00]\Field13 = $01
            hideentity(arg0\Field16[$00]\Field7)
            arg0\Field27[$00] = loadmesh_strict("GFX\Map\cont3_009_hb.b3d", arg0\Field15, $01)
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entityalpha(arg0\Field27[$00], 0.0)
            arg0\Field27[$01] = loadmesh_strict("GFX\Map\Props\scp_009.b3d", $00, $01)
            scaleentity(arg0\Field27[$01], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(arg0\Field27[$01], arg0\Field40, arg0\Field3, arg0\Field37, $00)
            entityalpha(arg0\Field27[$01], 0.8)
            entitypickmode(arg0\Field27[$01], $02, $01)
            entitytype(arg0\Field27[$01], $01, $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            local3 = createdecal($17, (arg0\Field40 - 0.59375), ((arg0\Field3 - 1.816406) + 0.005), (arg0\Field37 - 0.34375), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.1, 0.12), 0.8, $01, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local7 = createitem("Document SCP-009", $00, (arg0\Field40 - 2.292969), (arg0\Field3 + (1.0 / 1.479769)), (arg0\Field37 + 2.851562), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Hazmat Suit", $3C, (arg0\Field40 - 2.464844), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 - 3.410156), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 135.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Hazmat Suit", $3C, (arg0\Field40 - 2.464844), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 - 1.761719), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, -45.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 3.25))
            GUESSEDcreateentity_14(arg0, arg0\Field40, (arg0\Field3 + 2.605469), (arg0\Field37 - (1.0 / 1.590062)), 3.125, $FF, $32, $32, 0.0, 90.0, 90.0, 5.0, 90.0, 1.0, $01)
        Case $46
            local0 = createdoor(arg0, (arg0\Field40 - (1.0 / 0.64)), arg0\Field3, arg0\Field37, 90.0, $00, $00, $05, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 1.875), 0.0, $00, $00, $05, $00, $00)
            arg0\Field25[$01] = local0
            createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 1.113281), 0.0, $00, $00, $05, $00, $00)
            createdoor(arg0, (arg0\Field40 - 2.78125), arg0\Field3, (arg0\Field37 - 1.125), 0.0, $00, $02, $FFFFFFFE, $00, $00)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], arg0\Field40, (arg0\Field3 + 0.4), (arg0\Field37 + 2.0), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], arg0\Field40, (arg0\Field3 + 0.4), arg0\Field37, $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.367188), (arg0\Field3 + 1.757812), (arg0\Field37 + 1.289062), 30.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = -45.0
            local2\Field8 = 0.0
            local7 = createitem("Night Vision Goggles", $40, (arg0\Field40 - 1.109375), (arg0\Field3 + 0.5), (arg0\Field37 + (1.0 / 1.292929)), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(0.0, 1000.0)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 + 1.914062), (arg0\Field37 - 1.914062))
        Case $47
            local6 = setemitter(arg0, (arg0\Field40 + 2.0), (arg0\Field3 - 0.296875), (arg0\Field37 - 2.6875), $03)
            local6\Field7 = $01
            local6 = setemitter(arg0, (arg0\Field40 - 2.0), (arg0\Field3 - 0.296875), (arg0\Field37 - 2.6875), $03)
            local6\Field7 = $01
            local6 = setemitter(arg0, (arg0\Field40 + 2.0), (arg0\Field3 - 0.296875), (arg0\Field37 + 2.6875), $03)
            local6\Field7 = $01
            local6 = setemitter(arg0, (arg0\Field40 - 2.0), (arg0\Field3 - 0.296875), (arg0\Field37 + 2.6875), $03)
            local6\Field7 = $01
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 1.660156))
        Case $75
            local0 = createdoor(arg0, (arg0\Field40 + 1.84375), arg0\Field3, arg0\Field37, 90.0, $01, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 1.84375), arg0\Field3, arg0\Field37, 90.0, $01, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 1.84375), 0.0, $01, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 1.84375), 0.0, $01, $07, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$03] = local0
            createdoor(arg0, (arg0\Field40 - 2.921875), arg0\Field3, (arg0\Field37 - 1.0), 180.0, $00, $07, $05, $00, $00)
            createdoor(arg0, (arg0\Field40 - 1.0), arg0\Field3, (arg0\Field37 - 2.921875), 270.0, $00, $07, $05, $00, $00)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - 2.152344), (arg0\Field3 + 0.75), (arg0\Field37 - 3.769531), 180.0, $01)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], arg0\Field40, arg0\Field3, arg0\Field37, $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
        Case $4A
            local0 = createdoor(arg0, (arg0\Field40 + (1.0 / 1.28)), arg0\Field3, arg0\Field37, 0.0, $00, $00, $06, $00, $00)
            local0\Field33 = $15E
            positionentity(local0\Field40[$00], arg0\Field40, entityy(local0\Field40[$00], $01, 1.0), (arg0\Field37 - (1.0 / 1.179724)), $01)
            positionentity(local0\Field40[$01], arg0\Field40, entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 + (1.0 / 1.179724)), $01)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 - (1.0 / 1.28)), arg0\Field3, arg0\Field37, 0.0, $00, $00, $06, $00, $00)
            local0\Field33 = $15E
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$01] = local0
            arg0\Field25[$00]\Field26 = arg0\Field25[$01]
            arg0\Field25[$01]\Field26 = arg0\Field25[$00]
            If (currmapgrid\Field4[(Int (floor((arg0\Field40 / 8.0)) + ((floor((arg0\Field37 / 8.0)) - 1.0) * (Float X824BX6D68))))] = $00) Then
                local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 4.007812), 0.0, $00, $07, $00, $00, $00)
                local0\Field21 = $01
                local0\Field41 = $01
                local0\Field47 = $00
                freeentity(local0\Field40[$00])
                local0\Field40[$00] = $00
                freeentity(local0\Field7)
                local0\Field7 = $00
            EndIf
            arg0\Field27[$00] = copyentity(mon_i\Field3[$01], arg0\Field15)
            positionentity(arg0\Field27[$00], arg0\Field40, (arg0\Field3 + 1.5), (arg0\Field37 + 1.0), $01)
            scaleentity(arg0\Field27[$00], 2.0, 2.0, 2.0, $00)
            rotateentity(arg0\Field27[$00], 0.0, 180.0, 0.0, $00)
            arg0\Field27[$01] = copyentity(mon_i\Field3[$01], arg0\Field15)
            positionentity(arg0\Field27[$01], arg0\Field40, (arg0\Field3 + 1.5), (arg0\Field37 - 1.0), $01)
            scaleentity(arg0\Field27[$01], 2.0, 2.0, 2.0, $00)
            rotateentity(arg0\Field27[$01], 0.0, 0.0, 0.0, $00)
            local2 = createsecuritycam(arg0, (arg0\Field40 + 0.75), (arg0\Field3 + 2.75), (arg0\Field37 - 3.75), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 45.0
            local2\Field8 = 0.0
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 + (1.0 / 0.512)))
        Case $4B
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 7.503906), 0.0, $01, $01, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 4.298828), 0.0, $00, $03, $07, $00, $00)
            local0\Field47 = $00
            positionentity(local0\Field40[$00], (arg0\Field40 - 1.652344), entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 + 5.128906), $01)
            rotateentity(local0\Field40[$00], 0.0, 90.0, 0.0, $01)
            positionentity(local0\Field40[$01], (arg0\Field40 + 1.941406), entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 + 3.589844), $01)
            rotateentity(local0\Field40[$01], 0.0, -45.0, 0.0, $01)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 2.664062), arg0\Field3, (arg0\Field37 + 2.125), 90.0, $00, $04, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, (arg0\Field40 + 6.296875), arg0\Field3, (arg0\Field37 + 1.515625), 270.0, $00, $01, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            freeentity(local0\Field24[$00])
            local0\Field24[$00] = $00
            local0 = createdoor(arg0, (arg0\Field40 + 6.296875), arg0\Field3, (arg0\Field37 - 1.515625), 270.0, $00, $01, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            freeentity(local0\Field24[$00])
            local0\Field24[$00] = $00
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], arg0\Field40, arg0\Field3, (arg0\Field37 + 8.691406), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            GUESSEDcreateentity_14(arg0, arg0\Field40, (arg0\Field3 + 3.863281), arg0\Field37, 5.46875, $FF, $32, $32, 0.0, 90.0, 90.0, 4.5, 90.0, 1.0, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 3.203125))
        Case $4C
            local0 = createdoor(arg0, (arg0\Field40 + 5.96875), arg0\Field3, (arg0\Field37 - 0.25), 90.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 5.96875), arg0\Field3, (arg0\Field37 - 3.28125), 90.0, $00, $01, $00, $00, $00)
            local0\Field10 = $00
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            local0 = createdoor(arg0, (arg0\Field40 - 5.96875), arg0\Field3, (arg0\Field37 - 0.25), 90.0, $00, $01, $00, $00, $00)
            local0\Field10 = $00
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 9.125), 0.0, $01, $03, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            local0 = createdoor(arg0, (arg0\Field40 + 22.3125), (arg0\Field3 - 4.875), (arg0\Field37 + 19.40625), 90.0, $00, $07, $00, $00, $00)
            local0\Field10 = $00
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.08), $01)
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 + (1.0 / 0.2048)), (arg0\Field3 - 4.859375), (arg0\Field37 + 20.09375), 0.0, $00, $06, $00, $00, $00)
            local0\Field21 = $02
            local0\Field41 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 17.92969), (arg0\Field3 - 4.859375), (arg0\Field37 + 20.09375), 0.0, $00, $06, $00, $00, $00)
            local0\Field21 = $02
            local0\Field41 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 15.875), (arg0\Field3 - 4.875), (arg0\Field37 + 15.4375), 0.0, $00, $00, $04, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$00] = local0
            For local4 = Each rooms
                If (local4\Field22\Field21 = $4B) Then
                    local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 7.0), 180.0, $00, $01, $00, $00, $00)
                    arg0\Field25[$01] = local0
                    local4\Field27[$01] = createpivot($00)
                    positionentity(local4\Field27[$01], arg0\Field40, arg0\Field3, (arg0\Field37 - 8.183594), $00)
                    entityparent(local4\Field27[$01], arg0\Field15, $01)
                    Exit
                EndIf
            Next
            local0 = createdoor(arg0, (arg0\Field40 - 5.46875), (arg0\Field3 - 1.875), (arg0\Field37 + 9.0625), 0.0, (XZ0260X8X2\Field40 = $01), $00, $04, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.12), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.12), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 5.46875), (arg0\Field3 - 1.875), (arg0\Field37 + 17.0), 0.0, (XZ0260X8X2\Field40 = $01), $00, $04, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.12), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.12), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 4.640625), arg0\Field3, (arg0\Field37 + 7.65625), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], arg0\Field40, (arg0\Field3 + 0.375), (arg0\Field37 + 25.0), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 - 15.875), (arg0\Field3 - 4.875), (arg0\Field37 - 6.625), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$06] = createpivot($00)
            positionentity(arg0\Field27[$06], (arg0\Field40 - 13.9375), (arg0\Field3 - 4.253906), (arg0\Field37 + 19.3125), $00)
            entityparent(arg0\Field27[$06], arg0\Field15, $01)
        Case $4D
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 7.503906), 0.0, $01, $01, $00, $00, $00)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 4.298828), 0.0, $00, $03, $07, $00, $00)
            positionentity(local0\Field40[$00], (arg0\Field40 - 1.652344), entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 + 5.128906), $01)
            rotateentity(local0\Field40[$00], 0.0, 90.0, 0.0, $01)
            positionentity(local0\Field40[$01], (arg0\Field40 + 1.941406), entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 + 3.589844), $01)
            rotateentity(local0\Field40[$01], 0.0, -45.0, 0.0, $01)
            local0\Field47 = $00
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 - 4.423828), arg0\Field3, arg0\Field37, 90.0, $00, $03, $07, $00, $00)
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            positionentity(local0\Field40[$01], (arg0\Field40 - 3.691406), entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 + 1.648438), $01)
            rotateentity(local0\Field40[$01], 0.0, 0.0, 0.0, $01)
            local0\Field41 = $01
            local0\Field47 = $00
            local0\Field21 = $01
            local0 = createdoor(arg0, (arg0\Field40 + 4.423828), arg0\Field3, arg0\Field37, -90.0, $00, $03, $07, $00, $00)
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            positionentity(local0\Field40[$01], (arg0\Field40 + 3.691406), entityy(local0\Field40[$01], $01, 1.0), (arg0\Field37 - 1.648438), $01)
            rotateentity(local0\Field40[$01], 0.0, 180.0, 0.0, $01)
            local0\Field41 = $01
            local0\Field47 = $00
            local0\Field21 = $01
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], arg0\Field40, arg0\Field3, (arg0\Field37 + 8.691406), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            GUESSEDcreateentity_14(arg0, arg0\Field40, (arg0\Field3 + 4.042969), arg0\Field37, 5.46875, $FF, $32, $32, 0.0, 90.0, 90.0, 4.5, 90.0, 1.0, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 3.203125))
        Case $4E
            For local4 = Each rooms
                If (local4\Field22\Field21 = $4D) Then
                    local0 = createdoor(arg0, (arg0\Field40 - 21.1875), arg0\Field3, (arg0\Field37 - 5.359375), 0.0, $00, $01, $00, $00, $00)
                    arg0\Field25[$01] = local0
                    local4\Field27[$01] = createpivot($00)
                    positionentity(local4\Field27[$01], (arg0\Field40 - 21.1875), arg0\Field3, (arg0\Field37 - 4.171875), $00)
                    entityparent(local4\Field27[$01], arg0\Field15, $01)
                    Exit
                EndIf
            Next
            local0 = createdoor(arg0, (arg0\Field40 + 17.0), arg0\Field3, (arg0\Field37 - 1.921875), 0.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$02] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 17.0), arg0\Field3, (arg0\Field37 + 1.945312), 0.0, $00, $00, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$03] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 12.6875), (arg0\Field3 - 3.625), (arg0\Field37 + 25.0), 0.0, $00, $07, $00, $FFFFFFFF, $00)
            local0\Field21 = $01
            arg0\Field25[$04] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 10.71875), (arg0\Field3 - 3.625), (arg0\Field37 + 23.97266), 0.0, $00, $06, $00, $00, $00)
            local0\Field21 = $02
            local0\Field41 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, (arg0\Field40 + 18.62891), (arg0\Field3 + (1.0 / 16.0)), (arg0\Field37 - 8.203125), 180.0, $00, $06, $00, $00, $00)
            local0\Field21 = $02
            local0\Field41 = $01
            local0\Field47 = $00
            local0 = createdoor(arg0, (arg0\Field40 + 15.87891), (arg0\Field3 - 3.625), (arg0\Field37 + 25.92969), -270.0, $00, $07, $00, $00, $00)
            freeentity(local0\Field7)
            local0\Field7 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            createdoor(arg0, (arg0\Field40 + 12.0), (arg0\Field3 - 3.625), (arg0\Field37 + 22.65625), 90.0, $00, $00, $05, $00, $00)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], (arg0\Field40 + 17.04297), (arg0\Field3 - 0.96875), (arg0\Field37 + 10.80469), $00)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 20.28125), (arg0\Field3 + 5.5), (arg0\Field37 - 17.0), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            arg0\Field27[$03] = createpivot($00)
            positionentity(arg0\Field27[$03], (arg0\Field40 + 17.0), arg0\Field3, (arg0\Field37 + 5.25), $00)
            entityparent(arg0\Field27[$03], arg0\Field15, $01)
            arg0\Field27[$04] = createpivot($00)
            positionentity(arg0\Field27[$04], (arg0\Field40 + 11.0), (arg0\Field3 + 0.9375), (arg0\Field37 - 11.0), $00)
            entityparent(arg0\Field27[$04], arg0\Field15, $01)
            arg0\Field27[$05] = createpivot($00)
            positionentity(arg0\Field27[$05], (arg0\Field40 + 14.875), (arg0\Field3 + 6.0), (arg0\Field37 - 53.0), $00)
            entityparent(arg0\Field27[$05], arg0\Field15, $01)
            arg0\Field27[$07] = createpivot($00)
            positionentity(arg0\Field27[$07], (arg0\Field40 - 30.0), (arg0\Field3 + 0.8125), (arg0\Field37 - 105.6562), $00)
            entityparent(arg0\Field27[$07], arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 - 21.1875), (arg0\Field37 - 6.640625))
        Case $50
            local0 = createdoor(arg0, (arg0\Field40 - (1.0 / 1.07113)), arg0\Field3, (arg0\Field37 + 0.375), 0.0, $00, $01, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            freeentity(local0\Field24[$00])
            local0\Field24[$00] = $00
            local0 = createdoor(arg0, (arg0\Field40 + (1.0 / 1.07113)), arg0\Field3, (arg0\Field37 + 0.375), 0.0, $00, $01, $00, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 1.2), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            freeentity(local0\Field40[$01])
            local0\Field40[$01] = $00
            freeentity(local0\Field24[$00])
            local0\Field24[$00] = $00
            local2 = createsecuritycam(arg0, (arg0\Field40 + 1.5), (arg0\Field3 + 1.5), (arg0\Field37 - 3.75), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 45.0
            local2\Field8 = 45.0
        Case $51
            createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 0.9375), 0.0, $00, $00, $00, T20200F42ZD, $00)
            local7 = createitem("Field Agent Log #235-001-CO5", $00, arg0\Field40, (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 + 3.398438), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Groups of Interest Log", $00, (arg0\Field40 + (1.0 / 2.56)), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 + (1.0 / 2.56)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Note from Nobody #6", $00, (arg0\Field40 + 1.335938), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 + 1.167969), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("First Aid Kit", $34, (arg0\Field40 + 2.65625), (arg0\Field3 + 1.015625), (arg0\Field37 + 3.486328), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 - 2.734375), (arg0\Field3 + (1.0 / 1.219048)), (arg0\Field37 + 3.59375))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Ballistic Helmet", $26, (arg0\Field40 + 1.34375), (arg0\Field3 + (1.0 / 1.219048)), (arg0\Field37 - 3.515625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-268", $0C, (arg0\Field40 + 1.480469), (arg0\Field3 + (1.0 / 1.219048)), (arg0\Field37 + 1.054688), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 2.496094))
        Case $52
            local7 = createitem("Document SCP-106", $00, (arg0\Field40 + 1.578125), (arg0\Field3 + (1.0 / 1.765517)), (arg0\Field37 + 2.183594), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Level 2 Key Card", $5B, (arg0\Field40 - 0.609375), (arg0\Field3 + (1.0 / 1.695364)), (arg0\Field37 + 0.28125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("S-NAV Navigator", $49, (arg0\Field40 + 1.191406), (arg0\Field3 + (1.0 / 1.673203)), (arg0\Field37 + 3.6875), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(100.0, 0.0)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Notification", $00, (arg0\Field40 - (1.0 / 1.868613)), (arg0\Field3 + (1.0 / 1.673203)), (arg0\Field37 + 1.8125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $53
            local7 = createitem("Level 1 Key Card", $5A, (arg0\Field40 - 1.4375), (arg0\Field3 - 0.1875), (arg0\Field37 + (1.0 / 3.2)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Warning Labels #2", $00, (arg0\Field40 - 3.125), (arg0\Field3 - 0.1875), (arg0\Field37 + 1.4375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-093 Recovered Materials", $00, (arg0\Field40 - 3.125), (arg0\Field3 - 0.1875), (arg0\Field37 - 1.8125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("S-NAV Navigator", $49, (arg0\Field40 - 1.3125), (arg0\Field3 - 0.1875), (arg0\Field37 - 1.875), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(100.0, 0.0)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $54
            createdoor(arg0, (arg0\Field40 - 4.125), (arg0\Field3 + 1.5), (arg0\Field37 + 1.132812), 90.0, $00, $00, $05, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 4.125), (arg0\Field3 + 1.5), (arg0\Field37 - 2.875), 270.0, $01, $07, $03, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) + 1.2), $01)
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $54) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], arg0\Field15)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadmesh_strict("GFX\Map\room2_3_ez_hb.b3d", arg0\Field15, $01)
            EndIf
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entitytype(arg0\Field27[$00], $01, $00)
            entityalpha(arg0\Field27[$00], 0.0)
            local7 = createitem("Mobile Task Forces", $00, (arg0\Field40 + 2.304688), (arg0\Field3 + 0.9375), (arg0\Field37 - 3.6875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Security Clearance Levels", $00, (arg0\Field40 + 2.054688), (arg0\Field3 + 0.9375), (arg0\Field37 + 3.75), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Object Classes", $00, (arg0\Field40 + 0.625), (arg0\Field3 + 0.9375), (arg0\Field37 + 2.21875), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Dr. Ming's Proposal", $00, (arg0\Field40 - 5.625), (arg0\Field3 + 2.4375), (arg0\Field37 + 1.023438), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Radio Transceiver", $45, (arg0\Field40 - 4.625), (arg0\Field3 + 1.875), (arg0\Field37 - 3.125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 - 5.976562), (arg0\Field3 + 2.199219), (arg0\Field37 - 2.050781), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (rand($03, $01) = $01) Then
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 - 5.976562), (arg0\Field3 + 2.199219), (arg0\Field37 - (1.0 / 0.4096)), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local7 = createrandombattery((arg0\Field40 - 6.035156), (arg0\Field3 + 2.363281), (arg0\Field37 - 1.53125))
            entityparent(local7\Field9, arg0\Field15, $01)
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 - 6.015625), (arg0\Field3 + 1.933594), (arg0\Field37 - 1.25))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 - 5.972656), (arg0\Field3 + 2.363281), (arg0\Field37 - 1.203125))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $57
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $57) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], $00)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadanimmesh_strict("GFX\Map\Props\scp_789_j.b3d", $00, $01)
            EndIf
            local24 = (1.0 / 102.4)
            scaleentity(arg0\Field27[$00], local24, local24, local24, $00)
            entitytype(arg0\Field27[$00], $01, $00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 4.722656), arg0\Field3, (arg0\Field37 + (1.0 / 2.612245)), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            If (rand($03, $01) = $01) Then
                Select rand($04, $01)
                    Case $01
                        local12 = 925.0
                        local14 = 735.0
                    Case $02
                        local12 = 1109.0
                        local14 = 735.0
                    Case $03
                        local12 = 925.0
                        local14 = -735.0
                    Case $04
                        local12 = 1109.0
                        local14 = -735.0
                End Select
                local6 = setemitter(arg0, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + (1.0 / 1.815603)), (arg0\Field37 + (local14 * (1.0 / 256.0))), $11)
                local6\Field7 = $03
            EndIf
        Case $58
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 - 2.558594), (arg0\Field3 - 1.90625), (arg0\Field37 + (1.0 / 1.620253)))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($02, $01) = $01) Then
                local7 = createitem("E-Reader", $4D, (arg0\Field40 - 2.558594), (arg0\Field3 - 1.96875), (arg0\Field37 + 3.382812), $00, $00, $00, 1.0, $00)
                local7\Field15 = rnd(100.0, 0.0)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($02, $01) = $01) Then
                local7 = createitem("S-NAV Navigator", $49, (arg0\Field40 - 2.558594), (arg0\Field3 - 1.722656), (arg0\Field37 + 2.816406), $00, $00, $00, 1.0, $00)
                local7\Field15 = rnd(100.0, 0.0)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local7 = createitem("Security Clearance Levels", $00, (arg0\Field40 - 2.558594), (arg0\Field3 - 1.992188), (arg0\Field37 + (1.0 / 2.37037)), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $59
            local0 = createdoor(arg0, (arg0\Field40 + 6.6875), (arg0\Field3 - 1.5), (arg0\Field37 - 4.0), 0.0, $00, $07, $04, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            local0\Field41 = $01
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 1.8125), (arg0\Field3 - 1.5), (arg0\Field37 - 4.0), 0.0, $00, $07, $03, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            local0\Field41 = $01
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 + 0.90625), (arg0\Field3 - 1.5), (arg0\Field37 + 2.390625), 90.0, $00, $07, $03, $00, $00)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.08), $01)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], (arg0\Field40 + 6.949219), (arg0\Field3 - (1.0 / 1.551515)), (arg0\Field37 - 1.203125), $00)
            entityradius(arg0\Field27[$00], 0.1, 0.0)
            entitypickmode(arg0\Field27[$00], $01, $01)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            arg0\Field27[$01] = createpivot($00)
            positionentity(arg0\Field27[$01], arg0\Field40, (arg0\Field3 - 0.75), (arg0\Field37 + 3.253906), $00)
            entityradius(arg0\Field27[$01], 0.2, 0.0)
            entitypickmode(arg0\Field27[$01], $01, $01)
            entityparent(arg0\Field27[$01], arg0\Field15, $01)
            arg0\Field27[$02] = createpivot($00)
            positionentity(arg0\Field27[$02], (arg0\Field40 + 6.953125), (arg0\Field3 - 1.01875), (arg0\Field37 - 1.078125), $00)
            entityparent(arg0\Field27[$02], arg0\Field15, $01)
            local7 = createitem("Document SCP-294", $00, (arg0\Field40 + 7.273438), (arg0\Field3 - 0.46875), (arg0\Field37 - 3.617188), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Cup", $2B, (arg0\Field40 - 1.984375), (arg0\Field3 - (1.0 / 1.368984)), (arg0\Field37 + 1.109375), $F0, $AF, $46, 1.0, $00)
            local7\Field19 = "ORANGE JUICE"
            local7\Field24 = format(getlocalstring("items", "cupof"), getlocalstring("misc", "orange"), "%s")
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Cup", $2B, (arg0\Field40 + 3.660156), (arg0\Field3 - (1.0 / 1.368984)), (arg0\Field37 - 3.269531), $57, $3E, $2D, 1.0, $00)
            local7\Field19 = "COFFEE"
            local7\Field24 = format(getlocalstring("items", "cupof"), getlocalstring("misc", "coffee"), "%s")
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Pizza Slice", $6C, (arg0\Field40 - 2.1875), (arg0\Field3 - (1.0 / 1.132743)), (arg0\Field37 + 1.019531), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Pizza Slice", $6C, (arg0\Field40 + 4.136719), (arg0\Field3 - (1.0 / 1.132743)), (arg0\Field37 + 2.820312), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Pizza Slice", $6C, (arg0\Field40 + 4.457031), (arg0\Field3 - (1.0 / 1.132743)), (arg0\Field37 + 3.460938), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Pizza Slice", $6C, (arg0\Field40 + (1.0 / 0.15822)), (arg0\Field3 - (1.0 / 1.132743)), (arg0\Field37 + 3.429688), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Empty Cup", $2C, (arg0\Field40 - 2.109375), (arg0\Field3 - (1.0 / 1.368984)), (arg0\Field37 + 0.484375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Quarter", $6A, (arg0\Field40 - 1.746094), (arg0\Field3 - 1.304688), (arg0\Field37 + 0.140625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Quarter", $6A, (arg0\Field40 + 5.503906), (arg0\Field3 - 1.304688), (arg0\Field37 - 2.859375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $5A
            local0 = createdoor(arg0, (arg0\Field40 - 3.5), arg0\Field3, arg0\Field37, 90.0, $01, $01, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            local3 = createdecal($16, (arg0\Field40 - 2.777344), (arg0\Field3 + 0.005), (arg0\Field37 + 0.546875), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.8, 1.0), 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local7 = createitem("Bloody Level 0 Key Card", $59, (arg0\Field40 - 5.078125), (arg0\Field3 + 0.546875), (arg0\Field37 + (1.0 / 10.24)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Jim Gonzales' Badge", $03, (arg0\Field40 - 4.304688), (arg0\Field3 + 0.125), (arg0\Field37 + (1.0 / 1.354497)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Cup", $2B, (arg0\Field40 - (1.0 / 3.413333)), (arg0\Field3 + (1.0 / 1.113043)), (arg0\Field37 - 0.09375), $C8, $C8, $C8, 1.0, $00)
            local7\Field19 = "WATER"
            local7\Field24 = format(getlocalstring("items", "cupof"), getlocalstring("misc", "water"), "%s")
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Empty Cup", $2C, (arg0\Field40 + (1.0 / 1.79021)), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 + 3.773438), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 - (1.0 / 0.64)), arg0\Field37)
        Case $5B
            createdoor(arg0, (arg0\Field40 - 1.0), arg0\Field3, (arg0\Field37 + 2.5), 90.0, $00, $00, $04, $00, $00)
            createdoor(arg0, (arg0\Field40 - 2.0), arg0\Field3, (arg0\Field37 + 1.476562), 0.0, $00, $04, $00, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 4.3125), arg0\Field3, (arg0\Field37 + 2.5), 270.0, $00, $07, $04, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            If (rand($02, $01) = $01) Then
                local31 = $55
                local30 = "Syringe"
            Else
                local31 = $58
                local30 = "Infected Syringe"
            EndIf
            local7 = createitem(local30, local31, (arg0\Field40 - 3.605469), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 + 0.375), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (rand($02, $01) = $01) Then
                local31 = $55
                local30 = "Syringe"
            Else
                local31 = $58
                local30 = "Infected Syringe"
            EndIf
            local7 = createitem(local30, local31, (arg0\Field40 - 3.542969), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 + (1.0 / 1.610063)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Compact First Aid Kit", $36, (arg0\Field40 - 1.300781), (arg0\Field3 + 0.75), (arg0\Field37 - (1.0 / 2.081301)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $5C
            createdoor(arg0, (arg0\Field40 - 0.90625), (arg0\Field3 - 1.5), (arg0\Field37 - 2.515625), 90.0, $00, $00, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 - 0.90625), (arg0\Field3 - 1.5), (arg0\Field37 + 2.515625), 90.0, $00, $00, $00, $00, $00)
            local7 = createitem("Sticky Note", $00, (arg0\Field40 - 3.871094), (arg0\Field3 - (1.0 / 1.057851)), (arg0\Field37 + 3.53125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-999", $00, (arg0\Field40 - 5.75), (arg0\Field3 - 1.121094), (arg0\Field37 - 2.757812), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Note from Gears", $00, (arg0\Field40 - 3.035156), (arg0\Field3 - 0.71875), (arg0\Field37 + 1.363281), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 - 5.761719), (arg0\Field3 - (1.0 / 1.158371)), (arg0\Field37 - 1.984375))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Quarter", $6A, (arg0\Field40 - 2.070312), (arg0\Field3 - (1.0 / 1.158371)), (arg0\Field37 + 3.683594), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $5D
            createdoor(arg0, (arg0\Field40 + (1.0 / 1.094017)), arg0\Field3, arg0\Field37, 90.0, (rand($05, $01) = $01), $04, $00, $00, $00)
            arg0\Field27[$00] = loadmesh_strict("GFX\Map\room2_office_2_hb.b3d", arg0\Field15, $01)
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entitytype(arg0\Field27[$00], $01, $00)
            entityalpha(arg0\Field27[$00], 0.0)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.855469), (arg0\Field3 + 1.503906), (arg0\Field37 + 1.191406), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 30.0
            local7 = createrandombattery((arg0\Field40 + 2.242188), (arg0\Field3 + (1.0 / 1.113043)), (arg0\Field37 + 3.75))
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Document SCP-2022", $00, (arg0\Field40 + 2.042969), (arg0\Field3 + (1.0 / 2.56)), (arg0\Field37 - 3.753906), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 + 1.65625), (arg0\Field3 + (1.0 / 1.113043)), (arg0\Field37 + 3.75))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($03, $01) = $01) Then
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + 2.132812), (arg0\Field3 + (1.0 / 1.580247)), (arg0\Field37 - 3.746094), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $5E
            local0 = createdoor(arg0, (arg0\Field40 + 5.015625), (arg0\Field3 + 0.875), arg0\Field37, 90.0, $00, $00, $07, $00, $00)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) + 0.1), $01)
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.25), arg0\Field3, arg0\Field37, 90.0, $00, $00, $07, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) - 0.1), $01)
            arg0\Field25[$01] = local0
            local0 = createdoor(arg0, (arg0\Field40 - (1.0 / 1.094017)), arg0\Field3, (arg0\Field37 + 3.0), 270.0, $00, $04, $00, $00, $00)
            local0\Field21 = $02
            local0\Field47 = $00
            local0\Field41 = $01
            local7 = createitem("Some SCP-420-J", $0E, (arg0\Field40 + 7.007812), (arg0\Field3 + (1.0 / 0.64)), (arg0\Field37 + 1.667969), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Some SCP-420-J", $0E, (arg0\Field40 + 6.601562), (arg0\Field3 + (1.0 / 0.64)), (arg0\Field37 + 1.691406), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Level 5 Key Card", $5E, (arg0\Field40 + 8.203125), (arg0\Field3 + 1.53125), (arg0\Field37 + 1.511719), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Storage Transfers", $00, (arg0\Field40 + 8.203125), (arg0\Field3 + 1.71875), (arg0\Field37 + 1.453125), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Radio Transceiver", $45, (arg0\Field40 + 8.203125), (arg0\Field3 + 1.25), (arg0\Field37 + 0.5), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $5F
            createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, (arg0\Field37 + 2.625), 270.0, $00, $00, $06, $00, $00)
            createdoor(arg0, (arg0\Field40 - 2.0), (arg0\Field3 - 3.0), (arg0\Field37 - 1.25), 180.0, $00, $07, $06, $00, $00)
            local0 = createdoor(arg0, (arg0\Field40 - 2.0), (arg0\Field3 - 3.0), (arg0\Field37 - 4.0625), 0.0, $00, $07, $06, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local7 = createitem("Note from Nobody #5", $00, (arg0\Field40 + 0.046875), (arg0\Field3 - 2.460938), (arg0\Field37 - 1.601562), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Fine Night Vision Goggles", $42, (arg0\Field40 + 0.1875), (arg0\Field3 - 2.53125), (arg0\Field37 + 3.0625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $60
            createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, (arg0\Field37 + 1.9375), 270.0, $00, $00, $00, code_dr_maynard, $00)
            createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, (arg0\Field37 - 2.0625), 270.0, $00, $00, $00, $1E88, $00)
            createdoor(arg0, (arg0\Field40 - 1.375), arg0\Field3, arg0\Field37, 270.0, $00, $00, $00, code_dr_gears, $00)
            local7 = createitem("Mysterious Note", $00, (arg0\Field40 + 2.875), (arg0\Field3 + 0.875), (arg0\Field37 + 2.125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Ballistic Vest", $27, (arg0\Field40 + 2.375), (arg0\Field3 + 0.4375), (arg0\Field37 + 0.125), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Incident Report SCP-106-0204", $00, (arg0\Field40 + 2.75), (arg0\Field3 + (1.0 / 1.398907)), (arg0\Field37 - 2.25), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Journal Page", $00, (arg0\Field40 + 3.5625), (arg0\Field3 + 0.6875), (arg0\Field37 - 0.625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("First Aid Kit", $34, (arg0\Field40 + 3.5625), (arg0\Field3 + 0.4375), (arg0\Field37 - 1.3125), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 90.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Syringe", $55, (arg0\Field40 - 3.890625), (arg0\Field3 + (1.0 / 1.505882)), (arg0\Field37 + 0.515625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("SCP-2022", $24, (arg0\Field40 - 2.574219), (arg0\Field3 + 0.4375), (arg0\Field37 - 1.191406), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Pizza Slice", $6C, (arg0\Field40 - 3.144531), (arg0\Field3 + (1.0 / 1.505882)), (arg0\Field37 + 1.015625), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (i_005\Field0 = $03) Then
                local7 = createitem("SCP-005", $06, (arg0\Field40 + 2.875), (arg0\Field3 + 0.875), (arg0\Field37 + 2.949219), $00, $00, $00, 1.0, $00)
            Else
                local7 = createitem("Level 4 Key Card", $5D, (arg0\Field40 + 2.875), (arg0\Field3 + 0.875), (arg0\Field37 + 2.949219), $00, $00, $00, 1.0, $00)
            EndIf
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $61
            local0 = createdoor(arg0, (arg0\Field40 - 1.375), arg0\Field3, arg0\Field37, 90.0, $00, $00, $00, $96B, $00)
            local0\Field47 = $00
            local0\Field41 = $01
            affectdecaydoor(local0)
            arg0\Field25[$00] = local0
            createdoor(arg0, (arg0\Field40 + 1.0), arg0\Field3, arg0\Field37, 270.0, $00, $00, $07, $00, $00)
            local3 = createdecal($00, (arg0\Field40 - 2.78125), (arg0\Field3 + 0.005), (arg0\Field37 - 0.28125), 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($02, (arg0\Field40 - 2.78125), (arg0\Field3 + 0.01), (arg0\Field37 - 0.28125), 90.0, rnd(360.0, 0.0), 0.0, 0.3, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local3 = createdecal($00, (arg0\Field40 - 1.3125), (arg0\Field3 + 0.01), arg0\Field37, 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
            local7 = createitem("Dr. L's Burnt Note #1", $00, (arg0\Field40 - 2.3125), (arg0\Field3 + 1.0), (arg0\Field37 - (1.0 / 16.0)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Dr. L's Burnt Note #2", $00, (arg0\Field40 - 2.78125), (arg0\Field3 + 1.0), (arg0\Field37 - 0.28125), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("The Modular Site Project", $00, (arg0\Field40 + 2.429688), (arg0\Field3 + (1.0 / 2.048)), (arg0\Field37 - (1.0 / 3.506849)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $63
            createdoor(arg0, (arg0\Field40 + 2.90625), arg0\Field3, (arg0\Field37 + 2.5), 0.0, $00, $00, $FFFFFFFD, $00, $00)
            createdoor(arg0, (arg0\Field40 + 2.90625), arg0\Field3, (arg0\Field37 - 2.5), 0.0, $00, $00, $FFFFFFFD, $00, $00)
            createdoor(arg0, (arg0\Field40 + 0.90625), arg0\Field3, (arg0\Field37 - 2.5), 0.0, $00, $00, $06, $00, $00)
            createdoor(arg0, (arg0\Field40 + 0.90625), arg0\Field3, (arg0\Field37 + 2.5), 0.0, $00, $00, $06, $00, $00)
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, arg0\Field37, 0.0, $00, $05, $FFFFFFFC, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field30 = $01
            arg0\Field25[$00] = local0
            If (i_zone\Field0 = $00) Then
                local5 = (New forest)
                arg0\Field13 = local5
                genforestgrid(local5)
                placeforest(local5, arg0\Field40, (arg0\Field3 + 30.0), arg0\Field37, arg0)
            EndIf
            local7 = createitem("Document SCP-860-1", $00, (arg0\Field40 + 3.804688), (arg0\Field3 + (1.0 / 1.024)), (arg0\Field37 - (1.0 / 15.05882)), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 + 2.902344), arg0\Field37)
        Case $64
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.125), (arg0\Field3 + 1.5), (arg0\Field37 + 1.125), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 45.0
        Case $65
            createdoor(arg0, (arg0\Field40 + 2.363281), arg0\Field3, (arg0\Field37 - (1.0 / 1.094017)), 0.0, (rand($04, $01) = $01), $04, $00, $00, $00)
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $65) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], arg0\Field15)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadmesh_strict("GFX\Map\room2C_2_ez_hb.b3d", arg0\Field15, $01)
            EndIf
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entitytype(arg0\Field27[$00], $01, $00)
            entityalpha(arg0\Field27[$00], 0.0)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.125), (arg0\Field3 + 1.5), (arg0\Field37 + 1.125), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 45.0
            If (rand($03, $01) = $01) Then
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + 1.570312), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.601562), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            Else
                local7 = createitem("Syringe", $55, (arg0\Field40 + 1.570312), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.601562), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local7 = createitem("Cup", $2B, (arg0\Field40 + 2.078125), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 2.179688), $57, $3E, $2D, 1.0, $00)
            local7\Field19 = "COFFEE"
            local7\Field24 = format(getlocalstring("items", "cupof"), getlocalstring("misc", "coffee"), "%s")
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createrandombattery((arg0\Field40 + 3.4375), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 1.171875))
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $66
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 + 1.5), 0.0, $00, $00, $05, $00, $00)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 0.1), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            createdoor(arg0, (arg0\Field40 - 2.75), (arg0\Field3 + 3.5), (arg0\Field37 + 2.875), 90.0, $00, $07, $06, $00, $00)
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 - (1.0 / 1.07113)), (arg0\Field3 + 4.3125), (arg0\Field37 + 2.46875), -90.0, $01)
            arg0\Field9[$01] = createlever(arg0, (arg0\Field40 - (1.0 / 1.07113)), (arg0\Field3 + 4.3125), (arg0\Field37 + 2.21875), -90.0, $01)
            arg0\Field9[$02] = createlever(arg0, (arg0\Field40 - (1.0 / 1.07113)), (arg0\Field3 + 4.3125), (arg0\Field37 + 1.96875), -90.0, $01)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.035156), (arg0\Field3 + 5.0), (arg0\Field37 + (1.0 / 2.438095)), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 45.0
            local2\Field8 = 45.0
            local7 = createitem("Note from Daniel", $00, (arg0\Field40 - (1.0 / 0.64)), (arg0\Field3 + 4.0625), (arg0\Field37 + (1.0 / 2.226087)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $69
            createdoor(arg0, (arg0\Field40 + 2.363281), arg0\Field3, (arg0\Field37 - (1.0 / 1.094017)), 0.0, (rand($06, $01) = $01), $04, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 - 2.363281), arg0\Field3, (arg0\Field37 - (1.0 / 1.094017)), 0.0, $00, $04, $00, $00, $00)
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $69) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], arg0\Field15)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadmesh_strict("GFX\Map\room3_ez_hb.b3d", arg0\Field15, $01)
            EndIf
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entitytype(arg0\Field27[$00], $01, $00)
            entityalpha(arg0\Field27[$00], 0.0)
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.25), (arg0\Field3 + 1.5), (arg0\Field37 + 2.0), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 45.0
            local7 = createrandombattery((arg0\Field40 - 3.660156), (arg0\Field3 + 1.015625), (arg0\Field37 - 3.660156))
            entityparent(local7\Field9, arg0\Field15, $01)
            local27 = rand($05, $01)
            If (local27 > $03) Then
                local7 = createitem("Radio Transceiver", $45, (arg0\Field40 + 2.78125), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.113281), $00, $00, $00, 1.0, $00)
                local7\Field15 = rnd(0.0, 100.0)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem("Cup", $2B, (arg0\Field40 + 3.4375), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 1.171875), $C8, $C8, $C8, 1.0, $00)
                local7\Field19 = "COFFEE"
                local7\Field24 = format(getlocalstring("items", "cupof"), getlocalstring("misc", "coffee"), "%s")
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createrandombattery((arg0\Field40 + 3.683594), (arg0\Field3 + (1.0 / 1.024)), (arg0\Field37 - 3.648438))
                entityparent(local7\Field9, arg0\Field15, $01)
            ElseIf (local27 > $01) Then
                local7 = createitem("S-NAV Navigator", $49, (arg0\Field40 + 2.78125), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.113281), $00, $00, $00, 1.0, $00)
                local7\Field15 = rnd(0.0, 100.0)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createrandombattery((arg0\Field40 + 3.4375), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 1.171875))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($02, $01) = $01) Then
                local7 = createitem("Quarter", $6A, (arg0\Field40 - (1.0 / 1.094017)), (arg0\Field3 + (1.0 / 8.533334)), (arg0\Field37 + 1.972656), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $6A
            local7 = createrandombattery((arg0\Field40 - 0.515625), (arg0\Field3 - 1.4375), (arg0\Field37 - 2.570312))
            entityparent(local7\Field9, arg0\Field15, $01)
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 - 0.296875), (arg0\Field3 - 1.4375), (arg0\Field37 - 2.570312))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($02, $01) = $01) Then
                local7 = createrandombattery((arg0\Field40 - 0.765625), (arg0\Field3 - 1.4375), (arg0\Field37 - 2.570312))
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local7 = createitem("S-NAV Navigator", $49, (arg0\Field40 + (1.0 / 4.413793)), (arg0\Field3 - 1.96875), (arg0\Field37 - 2.570312), $00, $00, $00, 1.0, $00)
            local7\Field15 = rnd(100.0, 0.0)
            entityparent(local7\Field9, arg0\Field15, $01)
        Case $6B
            local7 = createitem("Document SCP-970", $00, (arg0\Field40 + 3.75), (arg0\Field3 - 1.75), (arg0\Field37 + (1.0 / 1.01992)), $00, $00, $00, 1.0, $00)
            rotateentity(local7\Field9, 0.0, 0.0, 0.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("Gas Mask", $38, (arg0\Field40 + 3.726562), (arg0\Field3 - 1.96875), (arg0\Field37 + (1.0 / 1.089362)), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            createcustomcenter(arg0, (arg0\Field40 - 3.585938), (arg0\Field37 - 3.585938))
        Case $6C
            local2 = createsecuritycam(arg0, (arg0\Field40 - 1.25), (arg0\Field3 + 1.5), (arg0\Field37 + 2.0), 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 45.0
        Case $67
            local0 = createdoor(arg0, arg0\Field40, arg0\Field3, (arg0\Field37 - 1.789062), 0.0, $00, $00, $04, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) - 0.07), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) + 0.04), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 1.12), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 0.04), $01)
            local0 = createdoor(arg0, (arg0\Field40 - 2.875), arg0\Field3, (arg0\Field37 - 1.789062), 0.0, $00, $00, $00, $00, $00)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) + 0.04), $01)
            positionentity(local0\Field40[$01], entityx(local0\Field40[$01], $01, 1.0), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 0.04), $01)
            local0 = createdoor(arg0, (arg0\Field40 - (1.0 / 1.07563)), arg0\Field3, (arg0\Field37 - 2.875), -90.0, $00, $00, $00, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) + 0.04), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.04), entityy(local0\Field40[$01], $01, 1.0), entityz(local0\Field40[$01], $01, 1.0), $01)
            local0 = createdoor(arg0, (arg0\Field40 + 0.96875), arg0\Field3, (arg0\Field37 - 2.875), 90.0, $00, $07, $03, $00, $00)
            local0\Field21 = $01
            local0\Field41 = $01
            local0\Field47 = $00
            freeentity(local0\Field40[$00])
            local0\Field40[$00] = $00
            freeentity(local0\Field7)
            local0\Field7 = $00
            local0 = createdoor(arg0, (arg0\Field40 - 1.800781), arg0\Field3, (arg0\Field37 + 1.324219), 90.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, (arg0\Field40 + 1.800781), arg0\Field3, (arg0\Field37 + 1.324219), 270.0, $01, $00, $00, $00, $00)
            local0\Field21 = $01
            local0\Field47 = $00
            For local25 = $00 To $01 Step $01
                freeentity(local0\Field40[local25])
                local0\Field40[local25] = $00
            Next
            arg0\Field25[$01] = local0
            arg0\Field9[$00] = createlever(arg0, (arg0\Field40 + 1.089844), (arg0\Field3 + 0.75), (arg0\Field37 + 0.640625), 0.0, $01)
            arg0\Field27[$00] = createpivot($00)
            positionentity(arg0\Field27[$00], arg0\Field40, (arg0\Field3 + 0.5), (arg0\Field37 + 1.3125), $00)
            entityparent(arg0\Field27[$00], arg0\Field15, $01)
            createcustomcenter(arg0, arg0\Field40, (arg0\Field37 - 2.875))
        Case $68
            createdoor(arg0, (arg0\Field40 + 3.0), arg0\Field3, (arg0\Field37 + (1.0 / 1.094017)), 180.0, $01, $04, $00, $00, $00)
            arg0\Field27[$00] = loadmesh_strict("GFX\Map\room3_office_hb.b3d", arg0\Field15, $01)
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entitytype(arg0\Field27[$00], $01, $00)
            entityalpha(arg0\Field27[$00], 0.0)
            local7 = createitem("SCP-085", $00, (arg0\Field40 + 1.207031), (arg0\Field3 + (1.0 / 1.398907)), (arg0\Field37 + 3.261719), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 - 3.738281), (arg0\Field3 + 0.859375), (arg0\Field37 + 2.574219), $00, $00, $00, 1.0, $00)
            entityparent(local7\Field9, arg0\Field15, $01)
            If (rand($02, $01) = $01) Then
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 - 3.738281), (arg0\Field3 + (1.0 / 1.630573)), (arg0\Field37 + 3.457031), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($02, $01) = $01) Then
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 + 1.199219), (arg0\Field3 + 0.546875), (arg0\Field37 + 3.167969), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            local3 = createdecal($16, (arg0\Field40 + 0.921875), (arg0\Field3 + 0.005), (arg0\Field37 - 0.265625), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.5, 0.7), 1.0, $00, $01, $00, $00, $00)
            entityparent(local3\Field0, arg0\Field15, $01)
        Case $6D
            createcustomcenter(arg0, (arg0\Field40 - 1.84375), arg0\Field37)
        Case $6E
            createdoor(arg0, (arg0\Field40 + 2.363281), arg0\Field3, (arg0\Field37 - (1.0 / 1.094017)), 0.0, (rand($05, $01) = $01), $04, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 + 2.363281), arg0\Field3, (arg0\Field37 + (1.0 / 1.094017)), 180.0, $00, $04, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 - 2.363281), arg0\Field3, (arg0\Field37 - (1.0 / 1.094017)), 0.0, $00, $04, $00, $00, $00)
            createdoor(arg0, (arg0\Field40 - 2.363281), arg0\Field3, (arg0\Field37 + (1.0 / 1.094017)), 180.0, (rand($03, $01) = $01), $04, $00, $00, $00)
            For local4 = Each rooms
                If (local4 <> arg0) Then
                    If (local4\Field22\Field21 = $6E) Then
                        arg0\Field27[$00] = copyentity(local4\Field27[$00], arg0\Field15)
                        Exit
                    EndIf
                EndIf
            Next
            If (arg0\Field27[$00] = $00) Then
                arg0\Field27[$00] = loadmesh_strict("GFX\Map\room4_2_ez_hb.b3d", arg0\Field15, $01)
            EndIf
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entitytype(arg0\Field27[$00], $01, $00)
            entityalpha(arg0\Field27[$00], 0.0)
            local2 = createsecuritycam(arg0, arg0\Field40, (arg0\Field3 + 1.5), arg0\Field37, 20.0, $00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
            local2\Field20 = 225.0
            local2\Field8 = 45.0
            local2\Field11 = $01
            local27 = rand($05, $01)
            If (local27 > $03) Then
                local7 = createitem("Radio Transceiver", $45, (arg0\Field40 + 2.78125), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.113281), $00, $00, $00, 1.0, $00)
                local7\Field15 = rnd(0.0, 100.0)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem("Cup", $2B, (arg0\Field40 + 3.4375), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 1.171875), $C8, $C8, $C8, 1.0, $00)
                local7\Field19 = "COFFEE"
                local7\Field24 = format(getlocalstring("items", "cupof"), getlocalstring("misc", "coffee"), "%s")
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createrandombattery((arg0\Field40 + 3.683594), (arg0\Field3 + (1.0 / 1.024)), (arg0\Field37 - 3.648438))
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem(getranddocument(), $00, (arg0\Field40 - 2.78125), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.113281), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 - 2.007812), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 + 2.234375), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createrandombattery((arg0\Field40 - 3.660156), (arg0\Field3 + 1.015625), (arg0\Field37 - 3.660156))
                entityparent(local7\Field9, arg0\Field15, $01)
            ElseIf (local27 > $01) Then
                local7 = createitem("S-NAV Navigator", $49, (arg0\Field40 + 2.78125), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.113281), $00, $00, $00, 1.0, $00)
                local7\Field15 = rnd(0.0, 100.0)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem("Empty Cup", $2C, (arg0\Field40 + 3.4375), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 1.171875), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createrandombattery((arg0\Field40 - 2.78125), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 - 3.113281))
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem("Quarter", $6A, (arg0\Field40 - 2.007812), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 + 2.234375), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
                local7 = createitem("ReVision Eyedrops", $30, (arg0\Field40 - 3.660156), (arg0\Field3 + 1.015625), (arg0\Field37 - 3.660156), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
            If (rand($02, $01) = $01) Then
                local7 = createitem("Quarter", $6A, (arg0\Field40 - 2.289062), (arg0\Field3 + (1.0 / 8.533334)), (arg0\Field37 + 2.84375), $00, $00, $00, 1.0, $00)
                entityparent(local7\Field9, arg0\Field15, $01)
            EndIf
        Case $6F
            local22 = loadtexture_strict("GFX\Map\Textures\rockmoss.jpg", $01, $00, 1.0)
            For local25 = $00 To $09 Step $01
                Select local25
                    Case $00
                        local12 = 5187.0
                        local14 = 2523.0
                        local29 = 180.0
                    Case $01
                        local12 = 5521.0
                        local14 = 1641.0
                        local29 = 180.0
                    Case $02
                        local12 = 9128.0
                        local14 = 2160.0
                        local29 = 180.0
                    Case $03
                        local12 = 8523.0
                        local14 = 1728.0
                        local29 = 180.0
                    Case $04
                        local12 = 9880.0
                        local14 = 1212.0
                        local29 = 180.0
                    Case $05
                        local12 = 5299.0
                        local14 = 360.0
                        local29 = 90.0
                    Case $06
                        local12 = 7807.0
                        local14 = 1259.0
                        local29 = 90.0
                    Case $07
                        local12 = 8196.0
                        local14 = 1404.0
                        local29 = 90.0
                    Case $08
                        local12 = 8143.0
                        local14 = 360.0
                        local29 = 90.0
                    Case $09
                        local12 = 9709.0
                        local14 = 888.0
                        local29 = 90.0
                End Select
                local3 = createdecal($00, (arg0\Field40 + (local12 * (1.0 / 256.0))), ((arg0\Field3 + 10.05469) + 0.05), ((arg0\Field37 + 32.0) + (local14 * (1.0 / 256.0))), 90.0, 0.0, 0.0, rnd(0.8, 1.0), 1.0, $00, $01, $00, $00, $00)
                local0 = createdoor(arg0, (arg0\Field40 + (local12 * (1.0 / 256.0))), (arg0\Field3 + 10.05469), ((arg0\Field37 + 32.0) + (local14 * (1.0 / 256.0))), local29, $00, $00, $09, $00, $00)
                entitytexture(local0\Field0, local22, $00, $00)
                If (local0\Field7 <> $00) Then
                    entitytexture(local0\Field7, local22, $00, $00)
                EndIf
                entitytexture(local0\Field51, local22, $00, $00)
            Next
            deletesingletextureentryfromcache(local22, $00)
            local22 = $00
            local0 = createdoor(arg0, arg0\Field40, (arg0\Field3 + 8.046875), ((arg0\Field37 + 32.0) - 4.0), 0.0, $00, $02, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$00] = local0
            local0 = createdoor(arg0, arg0\Field40, (arg0\Field3 + 8.0), ((arg0\Field37 + 32.0) + 4.0), 180.0, $00, $02, $00, $00, $00)
            local0\Field10 = $00
            arg0\Field25[$01] = local0
            local3 = createdecal($0D, (arg0\Field40 - 6.0), (arg0\Field3 + 0.02), ((arg0\Field37 + 2.375) + 32.0), 90.0, 0.0, 0.0, 0.8, 1.0, $00, $01, $00, $00, $00)
            local54 = loadrmesh("GFX\Map\dimension_106_2.rmesh", Null, $01)
            For local25 = $01 To $08 Step $01
                arg0\Field27[(local25 - $01)] = copyentity(local54, $00)
                local29 = ((Float (local25 - $01)) * 45.0)
                local32 = (sin(local29) * 2.0)
                local33 = (cos(local29) * 2.0)
                scaleentity(arg0\Field27[(local25 - $01)], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                entitytype(arg0\Field27[(local25 - $01)], $01, $00)
                entitypickmode(arg0\Field27[(local25 - $01)], $02, $01)
                rotateentity(arg0\Field27[(local25 - $01)], 0.0, (local29 - 90.0), 0.0, $00)
                positionentity(arg0\Field27[(local25 - $01)], (arg0\Field40 + local33), arg0\Field3, (arg0\Field37 + local32), $00)
                entityparent(arg0\Field27[(local25 - $01)], arg0\Field15, $01)
                If (local25 < $06) Then
                    local3 = createdecal((local25 + $07), (arg0\Field40 + (local33 * 2.0)), (arg0\Field3 + 0.02), (arg0\Field37 + (local32 * 2.0)), 90.0, (local29 - 90.0), 0.0, 0.5, 1.0, $01, $02, $00, $00, $00)
                EndIf
            Next
            freeentity(local54)
            local54 = $00
            arg0\Field27[$08] = loadrmesh("GFX\Map\dimension_106_3.rmesh", Null, $01)
            arg0\Field27[$09] = loadmesh_strict("GFX\Map\Props\dimension_106_pillar.b3d", $00, $01)
            arg0\Field27[$0A] = copyentity(arg0\Field27[$09], $00)
            arg0\Field27[$0B] = loadrmesh("GFX\Map\dimension_106_4.rmesh", Null, $01)
            For local25 = $08 To $0B Step $01
                scaleentity(arg0\Field27[local25], ((((Float (local25 = $0A)) * 1.5) + (Float (local25 <> $0A))) * (1.0 / 256.0)), ((((Float (local25 = $0A)) * 2.0) + (Float (local25 <> $0A))) * (1.0 / 256.0)), ((((Float (local25 = $0A)) * 1.5) + (Float (local25 <> $0A))) * (1.0 / 256.0)), $00)
                entitytype(arg0\Field27[local25], $01, $00)
                entitypickmode(arg0\Field27[local25], $02, $01)
                positionentity(arg0\Field27[local25], arg0\Field40, arg0\Field3, ((arg0\Field37 + 32.0) + (32.0 * (Float (local25 = $0B)))), $01)
            Next
            For local25 = $0C To $10 Step $01
                arg0\Field27[local25] = createpivot(arg0\Field27[$0B])
                Select local25
                    Case $0C
                        positionentity(arg0\Field27[local25], arg0\Field40, (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 + 64.0), $01)
                    Case $0D
                        positionentity(arg0\Field27[local25], (arg0\Field40 + 1.523438), (arg0\Field3 + (1.0 / 1.28)), ((arg0\Field37 + 64.0) + 1.0625), $01)
                    Case $0E
                        positionentity(arg0\Field27[local25], (arg0\Field40 + 3.273438), (arg0\Field3 + (1.0 / 1.28)), ((arg0\Field37 + 64.0) - 2.152344), $01)
                    Case $0F
                        positionentity(arg0\Field27[local25], (arg0\Field40 - (1.0 / 1.841727)), (arg0\Field3 + (1.0 / 1.28)), ((arg0\Field37 + 64.0) + 4.691406), $01)
                    Case $10
                        positionentity(arg0\Field27[local25], (arg0\Field40 - 4.835938), (arg0\Field3 - 6.5), ((arg0\Field37 + 64.0) + 1.488281), $01)
                End Select
            Next
            arg0\Field26[$00] = loadtexture_strict("GFX\NPCs\pd_plane.png", $03, $01, 1.0)
            arg0\Field26[$01] = loadtexture_strict("GFX\NPCs\pd_plane_eye.png", $03, $01, 1.0)
            arg0\Field27[$11] = createpivot($00)
            positionentity(arg0\Field27[$11], (entityx(arg0\Field27[$08], $01, 1.0) + (1.0 / 51.2)), (arg0\Field3 + 3.222656), (entityz(arg0\Field27[$08], $01, 1.0) - 10.83984), $00)
            entityparent(arg0\Field27[$11], arg0\Field15, $01)
            arg0\Field27[$12] = loadmesh_strict("GFX\Map\Props\throne_wall.b3d", $00, $01)
            arg0\Field30[$12] = $01
            positionentity(arg0\Field27[$12], entityx(arg0\Field27[$08], $01, 1.0), arg0\Field3, (entityz(arg0\Field27[$08], $01, 1.0) - 3.376953), $00)
            scaleentity(arg0\Field27[$12], (1.0 / 522.24), (1.0 / 256.0), (1.0 / 256.0), $00)
            entitypickmode(arg0\Field27[$12], $02, $01)
            entitytype(arg0\Field27[$12], $01, $00)
            entityparent(arg0\Field27[$12], arg0\Field15, $01)
            arg0\Field27[$13] = createsprite($00)
            arg0\Field30[$13] = $01
            scalesprite(arg0\Field27[$13], 8.0, 8.0)
            entitytexture(arg0\Field27[$13], arg0\Field26[$00], $00, $00)
            entityblend(arg0\Field27[$13], $02)
            entityfx(arg0\Field27[$13], $09)
            spriteviewmode(arg0\Field27[$13], $02)
            positionentity(arg0\Field27[$13], (entityx(arg0\Field27[$08], $01, 1.0) - 1000.0), (arg0\Field3 + 16.0), arg0\Field37, $01)
            GUESSEDcreatesurface(arg0\Field27[$13], $00, $460)
            arg0\Field27[$14] = loadmesh_strict("GFX\Map\dimension_106_terrain.b3d", $00, $01)
            arg0\Field30[$14] = $01
            local22 = loadtexture_strict("GFX\Map\Textures\rockmoss.jpg", $01, $00, 1.0)
            entitytexture(arg0\Field27[$14], local22, $00, $00)
            deletesingletextureentryfromcache(local22, $00)
            local22 = $00
            scaleentity(arg0\Field27[$14], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            entitytype(arg0\Field27[$14], $01, $00)
            positionentity(arg0\Field27[$14], arg0\Field40, ((arg0\Field3 + 16.0) + 11.5), (arg0\Field37 + 32.0), $01)
            For local25 = $12 To $14 Step $01
                hideentity(arg0\Field27[local25])
            Next
            arg0\Field27[$15] = createpivot($00)
            positionentity(arg0\Field27[$15], (arg0\Field40 + 28.16797), (arg0\Field3 + 10.35156), ((arg0\Field37 + 32.0) + 6.117188), $00)
            entityparent(arg0\Field27[$15], arg0\Field15, $01)
            arg0\Field27[$16] = createpivot($00)
            positionentity(arg0\Field27[$16], (arg0\Field40 + 20.55078), (arg0\Field3 + 10.35156), ((arg0\Field37 + 32.0) + 10.54688), $00)
            entityparent(arg0\Field27[$16], arg0\Field15, $01)
            arg0\Field27[$17] = createpivot($00)
            positionentity(arg0\Field27[$17], (arg0\Field40 + 26.69922), (arg0\Field3 + 10.35156), ((arg0\Field37 + 32.0) + 9.289062), $00)
            entityparent(arg0\Field27[$17], arg0\Field15, $01)
            arg0\Field27[$18] = createpivot($00)
            positionentity(arg0\Field27[$18], (arg0\Field40 + 30.95703), (arg0\Field3 + 10.35156), ((arg0\Field37 + 32.0) + (1.0 / 1.273632)), $00)
            entityparent(arg0\Field27[$18], arg0\Field15, $01)
            arg0\Field27[$19] = createpivot($00)
            positionentity(arg0\Field27[$19], (arg0\Field40 + 32.73438), (arg0\Field3 + 10.35156), ((arg0\Field37 + 32.0) + 8.988281), $00)
            entityparent(arg0\Field27[$19], arg0\Field15, $01)
            local7 = createitem("Burnt Note", $00, arg0\Field40, (arg0\Field3 + 0.5), (arg0\Field37 + 3.5), $00, $00, $00, 1.0, $00)
            local7 = createitem("George Maynard's Badge", $03, (arg0\Field40 - 5.078125), (arg0\Field3 + 0.5), (arg0\Field37 + 33.98438), $00, $00, $00, 1.0, $00)
        Case $70
            arg0\Field27[$10] = createpivot($00)
            positionentity(arg0\Field27[$10], (arg0\Field40 + (1.0 / 1.24878)), (arg0\Field3 + (1.0 / 1.28)), (arg0\Field37 + 8.933594), $00)
            entityparent(arg0\Field27[$10], arg0\Field15, $01)
            arg0\Field27[$11] = loadmesh_strict("GFX\Map\dimension1499\1499object0_cull.b3d", arg0\Field15, $01)
            arg0\Field30[$11] = $01
            entitytype(arg0\Field27[$11], $01, $00)
            entityalpha(arg0\Field27[$11], 0.0)
        Case $76
            createdoor(arg0, arg0\Field40, arg0\Field3, arg0\Field37, 45.0, $00, $00, $00, $00, $00)
            createcustomcenter(arg0, (arg0\Field40 + 0.75), (arg0\Field37 - 0.75))
        Case $78
            local0 = createdoor(arg0, (arg0\Field40 - (1.0 / 1.04918)), arg0\Field3, (arg0\Field37 - 2.875), 270.0, $00, $07, $FFFFFFFF, $00, $00)
            positionentity(local0\Field40[$00], (entityx(local0\Field40[$00], $01, 1.0) + 0.04), entityy(local0\Field40[$00], $01, 1.0), entityz(local0\Field40[$00], $01, 1.0), $01)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) - 0.04), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 1.2), $01)
            local0 = createdoor(arg0, (arg0\Field40 + 2.875), arg0\Field3, (arg0\Field37 + (1.0 / 1.04918)), 0.0, $00, $07, $FFFFFFFF, $00, $00)
            positionentity(local0\Field40[$01], (entityx(local0\Field40[$01], $01, 1.0) + 1.2), entityy(local0\Field40[$01], $01, 1.0), (entityz(local0\Field40[$01], $01, 1.0) - 0.04), $01)
            positionentity(local0\Field40[$00], entityx(local0\Field40[$00], $01, 1.0), entityy(local0\Field40[$00], $01, 1.0), (entityz(local0\Field40[$00], $01, 1.0) + 0.04), $01)
            arg0\Field27[$00] = loadmesh_strict("GFX\Map\room2C_research_hb.b3d", arg0\Field15, $01)
            arg0\Field30[$00] = $01
            entitypickmode(arg0\Field27[$00], $02, $01)
            entitytype(arg0\Field27[$00], $01, $00)
            entityalpha(arg0\Field27[$00], 0.0)
            local7 = createitem("SCP-500", $13, (arg0\Field40 - 3.125), (arg0\Field3 + (1.0 / 1.398907)), (arg0\Field37 + 3.089844), $00, $00, $00, 1.0, $00)
            local26 = rand($09, $01)
            For local25 = $00 To (local7\Field36 - $01) Step $01
                local8 = createitem("SCP-500-01", $14, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                local8\Field17 = $01
                local8\Field30 = $FFFFFFFF
                local7\Field8[local25] = local8
                local8\Field18 = local7\Field27
                hideentity(local8\Field9)
                If (local25 = local26) Then
                    Exit
                EndIf
            Next
            setanimtime(local7\Field5, max(0.0, (11.0 - (Float local26))), $00)
            entityparent(local7\Field9, arg0\Field15, $01)
    End Select
    For local56 = Each tempscreens
        If (local56\Field4 = arg0\Field22) Then
            createscreen(arg0, (arg0\Field40 + local56\Field6), (arg0\Field3 + local56\Field3), (arg0\Field37 + local56\Field8), local56\Field7, local56\Field1, local56\Field0, local56\Field9, local56\Field2, local56\Field5, local56\Field10)
        EndIf
    Next
    For local57 = Each tempwaypoints
        If (local57\Field3 = arg0\Field22) Then
            createwaypoint(Null, arg0, (arg0\Field40 + local57\Field0), (arg0\Field3 + local57\Field2), (arg0\Field37 + local57\Field1))
        EndIf
    Next
    For local58 = Each templights
        If (local58\Field7 = arg0\Field22) Then
            local11 = addlight(arg0, (arg0\Field40 + local58\Field11), (arg0\Field3 + local58\Field8), (arg0\Field37 + local58\Field4), local58\Field9, local58\Field1, local58\Field2, local58\Field3, local58\Field14, local58\Field5, local58\Field12, local58\Field0)
            local11\Field17 = local58\Field6
            local11\Field19 = local58\Field17
            local11\Field0 = local58\Field16
            rotateentity(local11\Field7, local58\Field15, local58\Field10, 0.0, $00)
        EndIf
    Next
    For local59 = Each tempprops
        If (local59\Field5 = arg0\Field22) Then
            createprop(arg0, local59\Field7, (arg0\Field40 + local59\Field9), (arg0\Field3 + local59\Field11), (arg0\Field37 + local59\Field8), local59\Field4, local59\Field1, local59\Field2, local59\Field3, local59\Field14, local59\Field15, local59\Field10, local59\Field13, local59\Field16, local59\Field12, local59\Field0, local59\Field6)
        EndIf
    Next
    For local60 = Each tempsoundemitters
        If (local60\Field1 = arg0\Field22) Then
            createsoundemitter(arg0, local60\Field2, (arg0\Field40 + local60\Field3), (arg0\Field3 + local60\Field0), (arg0\Field37 + local60\Field5), local60\Field4)
        EndIf
    Next
    For local61 = Each TFFD0Z88DZ
        If (local61\Field4 = arg0\Field22) Then
            createdoor(arg0, (arg0\Field40 + local61\Field0), (arg0\Field3 + local61\Field7), (arg0\Field37 + local61\Field9), local61\Field1, local61\Field10, local61\Field6, local61\Field8, local61\Field2, $00)
        EndIf
    Next
    GUESSEDcreategift(arg0, GUESSEDisdateevent())
    catcherrors((("Uncaught: FillRoom(Room ID: " + (Str arg0\Field22\Field21)) + ")"))
    Return $00
End Function
