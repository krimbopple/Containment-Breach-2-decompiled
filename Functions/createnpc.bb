Function createnpc.npcs(arg0%, arg1#, arg2#, arg3#)
    Local local0.npcs
    Local local1.npcs
    Local local2#
    Local local3%
    Local local4%
    Local local5%
    Local local6#
    Local local7#
    Local local8#
    Local local11%
    Local local12%
    Local local13%
    Local local14$
    Local local15%
    Local local16$
    catcherrors(((((((("CreateNPC(" + (Str arg0)) + ", ") + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)))
    local0 = (New npcs)
    local0\Field77 = arg0
    local0\Field42 = 1.0
    local0\Field46 = 0.2
    local0\Field23 = 0.2
    local0\Field37 = 10.0
    local0\Field36 = $01
    Select arg0
        Case $00
            local0\Field72 = getlocalstring("npc", "human")
            local0\Field32 = 0.015
            local0\Field4 = $64
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$00], $00)
            local2 = (0.51 / meshwidth(local0\Field98))
            scaleentity(local0\Field98, local2, local2, local2, $00)
            local6 = meshwidth(local0\Field98)
            local7 = meshheight(local0\Field98)
            local8 = meshdepth(local0\Field98)
            meshcullbox(local0\Field98, ((- local6) * 1.5), ((- local7) * 1.5), ((- local8) * 1.5), (local6 * 3.0), (local7 * 3.0), (local8 * 3.0))
            setnpcframe(local0, 11.0, $01)
            If (npcsound[$03] = $00) Then
                npcsound[$03] = loadsound_strict("SFX\SCP\008_1\Breath.ogg")
            EndIf
        Case $01
            local0\Field72 = getlocalstring("npc", "human")
            local0\Field32 = 0.015
            local0\Field4 = $64
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$01], $00)
            local2 = (0.5 / meshwidth(local0\Field98))
            scaleentity(local0\Field98, local2, local2, local2, $00)
            local6 = meshwidth(local0\Field98)
            local7 = meshheight(local0\Field98)
            local8 = meshdepth(local0\Field98)
            meshcullbox(local0\Field98, ((- local6) * 1.5), ((- local7) * 1.5), ((- local8) * 1.5), (local6 * 3.0), (local7 * 3.0), (local8 * 3.0))
            setnpcframe(local0, 11.0, $01)
            If (npcsound[$03] = $00) Then
                npcsound[$03] = loadsound_strict("SFX\SCP\008_1\Breath.ogg")
            EndIf
        Case $02
            local0\Field72 = getlocalstring("npc", "undefine")
            local0\Field4 = $1F4
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$02], $00)
            local2 = 0.055
            scaleentity(local0\Field98, local2, local2, local2, $00)
            setnpcframe(local0, 283.0, $01)
            If (npcsound[$04] = $00) Then
                npcsound[$04] = loadsound_strict("SFX\SCP\035_Tentacle\TentacleIdle.ogg")
            EndIf
        Case $03
            local0\Field72 = "SCP-049"
            local0\Field32 = 0.0175
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$03], $00)
            local2 = 1.2
            scaleentity(local0\Field98, local2, local2, local2, $00)
            If (npcsound[$05] = $00) Then
                npcsound[$05] = loadsound_strict("SFX\SCP\049\Breath.ogg")
            EndIf
        Case $04
            local0\Field72 = getlocalstring("npc", "human")
            local0\Field32 = 0.01
            local0\Field4 = $96
            local0\Field23 = 0.22
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$04], $00)
            local2 = 0.108
            scaleentity(local0\Field98, local2, local2, local2, $00)
            local6 = meshwidth(local0\Field98)
            local7 = meshheight(local0\Field98)
            local8 = meshdepth(local0\Field98)
            meshcullbox(local0\Field98, (- local6), (- local7), (- local8), (local6 * 2.0), (local7 * 2.0), (local8 * 2.0))
            If (npcsound[$06] = $00) Then
                npcsound[$06] = loadsound_strict("SFX\SCP\049_2\Breath.ogg")
            EndIf
            If (npcsound[$07] = $00) Then
                npcsound[$07] = loadsound_strict("SFX\SCP\049_2\Resting.ogg")
            EndIf
        Case $05
            local0\Field72 = "SCP-066"
            local0\Field32 = 0.02
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$05], $00)
            local2 = 0.068
            scaleentity(local0\Field98, local2, local2, local2, $00)
        Case $06
            local0\Field72 = "SCP-096"
            local0\Field32 = 0.06
            local0\Field82 = createpivot($00)
            local0\Field23 = 0.23
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$06], $00)
            local2 = 0.2
            scaleentity(local0\Field98, local2, local2, local2, $00)
            local6 = (meshwidth(local0\Field98) * 2.0)
            local7 = (meshheight(local0\Field98) * 2.0)
            local8 = (meshdepth(local0\Field98) * 2.0)
            meshcullbox(local0\Field98, (- local6), (- local7), (- local8), local6, (local7 * 2.0), (local8 * 2.0))
            local0\Field101 = createsprite(findchild(local0\Field98, "Reyelid"))
            scalesprite(local0\Field101, 0.07, 0.08)
            entityorder(local0\Field101, $FFFFFFFB)
            entitytexture(local0\Field101, X2Z260BF0Z\Field0[$02], $00, $00)
            hideentity(local0\Field101)
        Case $07
            local0\Field72 = "SCP-106"
            local0\Field42 = 0.0
            local0\Field46 = 0.0
            local0\Field32 = 0.014
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$07], $00)
            local2 = 0.1136
            local0\Field83 = local2
            scaleentity(local0\Field98, local0\Field83, local0\Field83, local0\Field83, $00)
        Case $08
            local0\Field72 = "SCP-173"
            local0\Field36 = $00
            local0\Field32 = 0.38
            local0\Field58 = $01
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, (local0\Field23 + 0.12))
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$08], $00)
            local0\Field101 = copyentity(n_i\Field9[$09], $00)
            Select left(currentdate(), $07)
                Case "31 Oct "
                    n_i\Field12 = $01
                    local5 = loadtexture_strict("GFX\NPCs\scp_173_H.png", $01, $00, 1.0)
                Case "01 Jan "
                    n_i\Field7 = $01
                    local5 = loadtexture_strict("GFX\NPCs\scp_173_NY.png", $01, $00, 1.0)
                Case "01 Apr "
                    n_i\Field5 = $01
                    local5 = loadtexture_strict("GFX\NPCs\scp_173_J.png", $01, $00, 1.0)
            End Select
            If (local5 <> $00) Then
                entitytexture(local0\Field98, local5, $00, $00)
                entitytexture(local0\Field101, local5, $00, $00)
                deletesingletextureentryfromcache(local5, $00)
                local5 = $00
            EndIf
            local2 = (0.3 / meshdepth(local0\Field98))
            scaleentity(local0\Field98, local2, local2, local2, $00)
            scaleentity(local0\Field101, local2, local2, local2, $00)
            local0\Field99 = copyentity(n_i\Field9[$0A], $00)
            scaleentity(local0\Field99, (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            hideentity(local0\Field99)
        Case $09
            local0\Field72 = "SCP-372"
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            local0\Field98 = copyentity(n_i\Field9[$0F], $00)
            local2 = (0.25 / meshwidth(local0\Field98))
            scaleentity(local0\Field98, local2, local2, local2, $00)
            hideentity(local0\Field98)
        Case $0B
            local0\Field72 = "SCP-513-1"
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            local0\Field98 = copyentity(n_i\Field9[$10], $00)
            hideentity(local0\Field98)
            local0\Field101 = copyentity(local0\Field98, $00)
            entityalpha(local0\Field101, 0.6)
            hideentity(local0\Field101)
            local0\Field46 = 0.0
            local2 = (1.8 / meshwidth(local0\Field98))
            scaleentity(local0\Field98, local2, local2, local2, $00)
            scaleentity(local0\Field101, local2, local2, local2, $00)
        Case $0C
            local0\Field72 = getlocalstring("npc", "undefine")
            local0\Field32 = 0.08
            local0\Field82 = createpivot($00)
            local0\Field23 = 0.45
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$11], $00)
            local2 = 0.025
            scaleentity(local0\Field98, local2, local2, local2, $00)
            local6 = (meshwidth(local0\Field98) * 2.0)
            local7 = (meshheight(local0\Field98) * 2.0)
            local8 = (meshdepth(local0\Field98) * 2.0)
            meshcullbox(local0\Field98, (- local6), (- local7), (- local8), local6, (local7 * 2.0), (local8 * 2.0))
            entityfx(local0\Field98, $01)
            local0\Field101 = createsprite($00)
            scalesprite(local0\Field101, 0.1, 0.1)
            local5 = loadtexture_strict("GFX\NPCs\scp_860_2_eyes.png", $03, $00, 1.0)
            entitytexture(local0\Field101, local5, $00, $00)
            deletesingletextureentryfromcache(local5, $00)
            local5 = $00
            entityfx(local0\Field101, $09)
            entityblend(local0\Field101, $03)
            spriteviewmode(local0\Field101, $02)
            hideentity(local0\Field101)
            If (forestnpc = $00) Then
                forestnpc = createsprite($00)
                scalesprite(forestnpc, (1.0 / 3.904762), 0.75)
                spriteviewmode(forestnpc, $04)
                entityfx(forestnpc, $09)
                forestnpctex = loadanimtexture_strict("GFX\NPCs\AgentIJ.AIJ", $03, $8C, $19A, $00, $04, $01)
                forestnpcdata[$00] = 0.0
                entitytexture(forestnpc, forestnpctex, (Int forestnpcdata[$00]), $00)
                forestnpcdata[$01] = 0.0
                forestnpcdata[$02] = 0.0
                hideentity(forestnpc)
            EndIf
        Case $0D
            local3 = $01
            For local1 = Each npcs
                If (local0 <> local1) Then
                    If (local0\Field77 = local1\Field77) Then
                        local3 = (local3 + $01)
                    EndIf
                EndIf
            Next
            local0\Field72 = ("SCP-939-" + (Str local3))
            local0\Field32 = 0.04
            local0\Field82 = createpivot($00)
            local0\Field23 = 0.34
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$12], $00)
            local2 = 0.6
            scaleentity(local0\Field98, local2, local2, local2, $00)
        Case $0E
            local3 = $01
            For local1 = Each npcs
                If (local0 <> local1) Then
                    If (local0\Field77 = local1\Field77) Then
                        local3 = (local3 + $01)
                    EndIf
                EndIf
            Next
            local0\Field72 = ("SCP-966-" + (Str local3))
            local0\Field32 = 0.01
            local0\Field82 = createpivot($00)
            local0\Field23 = 0.17
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$13], $00)
            local2 = (rnd(0.875, 1.0) * 0.0115)
            local0\Field83 = local2
            scaleentity(local0\Field98, local0\Field83, local0\Field83, local0\Field83, $00)
            setnpcframe(local0, 15.0, $01)
        Case $0F
            local0\Field72 = "SCP-999"
            local0\Field32 = 0.008
            local0\Field65 = 1.0
            local0\Field82 = createpivot($00)
            local0\Field23 = 0.15
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$14], $00)
            local2 = 0.0035
            scaleentity(local0\Field98, local2, local2, local2, $00)
        Case $10
            local0\Field72 = "SCP-1048"
            local0\Field42 = 0.0
            local0\Field46 = 0.0
            local0\Field23 = 0.07
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, (local0\Field23 + 0.13))
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$15], $00)
            entitypickmode(local0\Field98, $02, $01)
            local2 = 0.05
            scaleentity(local0\Field98, local2, local2, local2, $00)
        Case $11
            local0\Field72 = getlocalstring("npc", "undefine")
            local0\Field32 = 0.01
            local0\Field4 = $3C
            local0\Field82 = createpivot($00)
            local0\Field23 = 0.07
            entityradius(local0\Field82, local0\Field23, (local0\Field23 + 0.1))
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$16], $00)
            local2 = (rnd(0.9, 1.1) * 0.05)
            local0\Field83 = local2
            scaleentity(local0\Field98, local0\Field83, local0\Field83, local0\Field83, $00)
        Case $12
            local0\Field72 = getlocalstring("npc", "undefine")
            local0\Field32 = (rnd(0.9, 1.1) * 0.015)
            local0\Field23 = 0.26
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$17], $00)
            local2 = (rnd(0.8, 1.0) * 0.02)
            scaleentity(local0\Field98, local0\Field83, local0\Field83, local0\Field83, $00)
            entityfx(local0\Field98, $01)
            entityautofade(local0\Field98, (hidedistance * 2.5), (hidedistance * 2.95))
        Case $13
            local0\Field72 = getlocalstring("npc", "apache")
            local0\Field42 = 0.0
            local0\Field46 = 0.0
            local0\Field82 = createpivot($00)
            local0\Field23 = 3.0
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $04, $00)
            local0\Field98 = copyentity(n_i\Field9[$18], $00)
            local0\Field101 = copyentity(n_i\Field9[$19], $00)
            entityparent(local0\Field101, local0\Field98, $01)
            For local3 = $FFFFFFFF To $01 Step $02
                local11 = copyentity(local0\Field101, local0\Field101)
                rotateentity(local11, 0.0, (4.0 * (Float local3)), 0.0, $00)
                entityalpha(local11, 0.5)
            Next
            local0\Field99 = copyentity(n_i\Field9[$1A], $00)
            entityparent(local0\Field99, local0\Field98, $01)
            positionentity(local0\Field99, 0.0, 2.15, -5.48, $00)
            For local3 = $FFFFFFFF To $01 Step $02
                local12 = CreateLight($03, local0\Field98)
                LightRange(local12, 16.79688)
                LightColor(local12, $FF, $FF, $FF)
                TX2026B22F(local12, $01)
                TDB064BXFX(local12, 75.0)
                positionentity(local12, (1.5 * (Float local3)), 0.57, -0.25, $00)
                rotateentity(local12, 90.0, 0.0, 0.0, $00)
                local13 = createsprite(local12)
                scalesprite(local13, 0.13, 0.13)
                entitytexture(local13, misc_i\Field0[$00], $00, $00)
                entityblend(local13, $03)
                entityfx(local13, $09)
            Next
            scaleentity(local0\Field98, 0.7, 0.7, 0.7, $00)
            If (npcsound[$0A] = $00) Then
                npcsound[$0A] = loadsound_strict("SFX\Character\Apache\Propeller.ogg")
            EndIf
        Case $16,$14
            local14 = "Class D"
            local15 = $1C
            If (local0\Field77 = $14) Then
                local14 = "Clerk"
                local15 = $1B
            EndIf
            local0\Field72 = getlocalstring("npc", "human")
            local0\Field32 = 0.02
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[local15], $00)
            local2 = (0.51 / meshwidth(local0\Field98))
            scaleentity(local0\Field98, local2, local2, local2, $00)
            local6 = meshwidth(local0\Field98)
            local7 = meshheight(local0\Field98)
            local8 = meshdepth(local0\Field98)
            meshcullbox(local0\Field98, ((- local6) * 1.5), ((- local7) * 1.5), ((- local8) * 1.5), (local6 * 3.0), (local7 * 3.0), (local8 * 3.0))
        Case $15
            local0\Field72 = "Cockroach"
            local0\Field32 = 0.02
            local0\Field42 = 0.0
            local0\Field46 = 0.0
            local0\Field4 = $01
            local0\Field82 = createpivot($00)
            local0\Field23 = 0.05
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $00, $00)
            local0\Field98 = copyentity(n_i\Field9[$21], $00)
            local2 = (rnd(0.9, 1.1) * 0.024)
            local0\Field83 = local2
            scaleentity(local0\Field98, local0\Field83, local0\Field83, local0\Field83, $00)
        Case $17
            local0\Field72 = getlocalstring("npc", "human")
            local0\Field32 = 0.02
            local0\Field23 = 0.26
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$1E], $00)
            local2 = 0.116
            scaleentity(local0\Field98, local2, local2, local2, $00)
            local6 = meshwidth(local0\Field98)
            local7 = meshheight(local0\Field98)
            local8 = meshdepth(local0\Field98)
            meshcullbox(local0\Field98, (- local6), (- local7), (- local8), (local6 * 2.0), (local7 * 2.0), (local8 * 2.0))
        Case $18
            local0\Field72 = getlocalstring("npc", "human")
            local0\Field32 = 0.022
            local0\Field4 = $64
            local0\Field46 = 0.03
            local0\Field23 = 0.22
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field98 = copyentity(n_i\Field9[$1F], $00)
            local2 = 0.12
            scaleentity(local0\Field98, local2, local2, local2, $00)
            local6 = meshwidth(local0\Field98)
            local7 = meshheight(local0\Field98)
            local8 = meshdepth(local0\Field98)
            meshcullbox(local0\Field98, (- local6), (- local7), (- local8), (local6 * 2.0), (local7 * 2.0), (local8 * 2.0))
            If (npcsound[$00] = $00) Then
                npcsound[$00] = loadsound_strict("SFX\Character\MTF\Beep.ogg")
            EndIf
            If (npcsound[$01] = $00) Then
                npcsound[$01] = loadsound_strict("SFX\Character\MTF\Breath.ogg")
            EndIf
        Case $0A
            local0\Field72 = "SCP-457"
            local0\Field32 = 0.025
            local0\Field82 = createpivot($00)
            entityradius(local0\Field82, local0\Field23, 0.0)
            entitytype(local0\Field82, $02, $00)
            local0\Field101 = CreateLight($02, local0\Field82)
            LightRange(local0\Field101, 2.0)
            LightColor(local0\Field101, $FF, $8C, $32)
            TX2026B22F(local0\Field101, $01)
            moveentity(local0\Field101, 0.0, (local0\Field23 * 2.0), 0.0, $00)
            local0\Field98 = copyentity(n_i\Field9[$1C], $00)
            local2 = (0.51 / meshwidth(local0\Field98))
            scaleentity(local0\Field98, local2, local2, local2, $00)
            entityalpha(local0\Field98, 0.0)
            For local3 = $00 To $13 Step $01
                Select local3
                    Case $00
                        local16 = "Bip01_R_Finger0"
                    Case $01
                        local16 = "Bip01_R_Hand"
                    Case $02
                        local16 = "Bip01_R_Forearm"
                    Case $03
                        local16 = "Bip01_R_UpperArm"
                    Case $04
                        local16 = "Bip01_L_UpperArm"
                    Case $05
                        local16 = "Bip01_L_Forearm"
                    Case $06
                        local16 = "Bip01_L_Hand"
                    Case $07
                        local16 = "Bip01_L_Finger0"
                    Case $08
                        local16 = "Bip01_L_Foot"
                    Case $09
                        local16 = "Bip01_L_Calf"
                    Case $0A
                        local16 = "Bip01_L_Thigh"
                    Case $0B
                        local16 = "Bip01_R_Foot"
                    Case $0C
                        local16 = "Bip01_R_Calf"
                    Case $0D
                        local16 = "Bip01_R_Thigh"
                    Case $0E
                        local16 = "Bip01_Head"
                    Case $0F
                        local16 = "Bip01_Pelvis"
                    Case $10
                        local16 = "Bip01_Spine"
                    Case $11
                        local16 = "Bip01_Spine1"
                    Case $12
                        local16 = "Bip01_Spine2"
                    Case $13
                        local16 = "Bip01_Neck"
                End Select
                local0\Field39[local3] = findchild(local0\Field98, local16)
                local0\Field33[local3] = setemitter(Null, entityx(local0\Field39[local3], $01, 1.0), entityy(local0\Field39[local3], $01, 1.0), entityz(local0\Field39[local3], $01, 1.0), $24)
                entityparent(local0\Field33[local3]\Field2, local0\Field39[local3], $01)
            Next
            If (npcsound[$0C] = $00) Then
                npcsound[$0C] = loadsound_strict("SFX\SCP\457\Sighting.ogg")
            EndIf
            If (npcsound[$0B] = $00) Then
                npcsound[$0B] = loadsound_strict("SFX\SCP\457\FireLoop.ogg")
            EndIf
    End Select
    positionentity(local0\Field82, arg1, arg2, arg3, $01)
    positionentity(local0\Field98, arg1, arg2, arg3, $01)
    resetentity(local0\Field82)
    T2XZ6D80XDB(local0, $FFFFFFFF)
    YX2D2860X(local0\Field98, (opt\Field76 = $04), $FFFFFFFF)
    If (local0\Field101 <> $00) Then
        YX2D2860X(local0\Field101, (opt\Field76 = $04), $FFFFFFFF)
    EndIf
    npcspeedchange(local0)
    catcherrors(((((((("Uncaught: CreateNPC(" + (Str arg0)) + ", ") + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)))
    Return local0
    Return Null
End Function
