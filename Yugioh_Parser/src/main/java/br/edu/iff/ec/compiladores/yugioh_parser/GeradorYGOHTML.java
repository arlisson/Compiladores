/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iff.ec.compiladores.yugioh_parser;

/**
 *
 * @author T-GAMER
 */
public class GeradorYGOHTML extends ParserBaseVisitor<Void>{
    StringBuilder saida;

    public GeradorYGOHTML() {
        saida = new StringBuilder();    
        
        
    }

    @Override
    public Void visitCriarCarta(ParserParser.CriarCartaContext ctx) {
        
      
        
        saida.append("<!DOCTYPE html>\n" +
"<html>\n" +
"\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Trading Card Game</title>\n" +
"    <style>\n" +
"        * {\n" +
"            padding: 0;\n" +
"            margin: 0;\n" +
"        }\n" +
"\n" +
"        p {\n" +
"            text-align: justify;\n" +
"\n" +
"        }\n" +
"\n" +
"        .container {\n" +
"            position: relative;\n" +
"            padding: auto;\n" +
"            max-width: auto;\n" +
"            margin: 0 auto;\n" +
"\n" +
"        }\n" +
"\n" +
"        body {\n" +
"            background-image: url('imagens_site/yugioh.jpg');\n" +
"            background-repeat: repeat;\n" +
"            background-size: cover;\n" +
"            position: absolute;\n" +
"            height: 100%;\n" +
"            width: 100%;\n" +
"            flex-direction: column;\n" +
"            display: flex;\n" +
"            /*min-height: 100vh;*/\n" +
"\n" +
"        }\n" +
"\n" +
"        header {\n" +
"            background-color: rgba(0, 0, 0, 0.8);\n" +
"            color: #fff;\n" +
"            padding: 20px;\n" +
"            text-align: center;\n" +
"\n" +
"        }\n" +
"\n" +
"        /* Estilos do footer */\n" +
"        footer {\n" +
"            background-color: rgba(0, 0, 0, 0.8);\n" +
"            color: #fff;\n" +
"            padding: 10px;\n" +
"            text-align: center;\n" +
"            margin-top: auto;\n" +
"            bottom: 0;\n" +
"            height: 6vh;\n" +
"\n" +
"\n" +
"        }\n" +
"\n" +
"        .main {\n" +
"            flex-grow: 1;\n" +
"            margin-bottom: 6vh;\n" +
"        }\n" +
"\n" +
"        .gallery-wraper {\n" +
"            overflow-x: scroll;\n" +
"\n" +
"        }\n" +
"\n" +
"        .gallery {\n" +
"            display: flex;\n" +
"            flex-flow: nowrap;\n" +
"        }\n" +
"\n" +
"        .Profile {\n" +
"\n" +
"            padding: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_monster_effect {\n" +
"            background-image: url(\"imagens_site/monster_effect.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_monster_normal {\n" +
"            background-image: url(\"imagens_site/fundo_normal.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_monster_fusion {\n" +
"            background-image: url(\"imagens_site/fundo_fusao.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_monster_sincro {\n" +
"            background-image: url(\"imagens_site/synchro.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_monster_xyz {\n" +
"            background-image: url(\"imagens_site/fundo_xyz.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_monster_ritual {\n" +
"            background-image: url(\"imagens_site/fundo_ritual.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_normal_spell {\n" +
"            background-image: url(\"imagens_site/fundo_spell.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_spell_continuous {\n" +
"            background-image: url(\"imagens_site/fundo_spell.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_spell_equip {\n" +
"            background-image: url(\"imagens_site/fundo_spell.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_spell_field {\n" +
"            background-image: url(\"imagens_site/fundo_spell.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_spell_quick {\n" +
"            background-image: url(\"imagens_site/fundo_spell.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_spell_ritual {\n" +
"            background-image: url(\"imagens_site/fundo_spell.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_normal_trap {\n" +
"            background-image: url(\"imagens_site/fundo_trap.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_counter_trap {\n" +
"            background-image: url(\"imagens_site/fundo_trap.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .profile_continuous_trap {\n" +
"            background-image: url(\"imagens_site/fundo_trap.jpg\");\n" +
"            background-repeat: no-repeat;\n" +
"            background-position: center;\n" +
"            background-size: cover;\n" +
"            width: 280px;\n" +
"            height: auto;\n" +
"            padding: 5px;\n" +
"            overflow: hidden;\n" +
"            border: 5px solid #363636;\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        .pname {\n" +
"            display: flex;\n" +
"            font-size: 20px;\n" +
"            white-space: nowrap;\n" +
"            font-weight: bold;\n" +
"            text-align: center center;\n" +
"            color: #000;\n" +
"            align-items: center center;\n" +
"            transform: scaleY(4);\n" +
"            transform-origin: top;\n" +
"\n" +
"        }\n" +
"\n" +
"        .pname_xyz {\n" +
"            display: flex;\n" +
"            font-size: 20px;\n" +
"            white-space: nowrap;\n" +
"            font-weight: bold;\n" +
"            text-align: center center;\n" +
"            color: #fff;\n" +
"            align-items: center center;\n" +
"            transform: scaleY(4);\n" +
"            transform-origin: top;\n" +
"        }\n" +
"\n" +
"        .pname_fusion {\n" +
"            display: flex;\n" +
"            font-size: 20px;\n" +
"            white-space: nowrap;\n" +
"            font-weight: bold;\n" +
"            text-align: center center;\n" +
"            color: #000;\n" +
"            align-items: center center;\n" +
"            transform: scaleY(4);\n" +
"            transform-origin: top;\n" +
"        }\n" +
"\n" +
"        .pname_ritual {\n" +
"            display: flex;\n" +
"            font-size: 20px;\n" +
"            white-space: nowrap;\n" +
"            font-weight: bold;\n" +
"            text-align: center center;\n" +
"            color: #000;\n" +
"            align-items: center center;\n" +
"            transform: scaleY(4);\n" +
"            transform-origin: top;\n" +
"        }\n" +
"\n" +
"        .profile-name {\n" +
"            background: rgba(255, 255, 255, 0.2);\n" +
"            padding: 3px;\n" +
"            border-radius: 0px;\n" +
"            /*box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.6), -2px -2px 5px rgba(255, 255, 255, 0.8);*/\n" +
"            margin: 6px 3px 5px 3px;\n" +
"            border-top: outset rgba(255, 255, 255, 0.6);\n" +
"            border-bottom: outset rgba(0, 0, 0, 0.6);\n" +
"            border-left: outset rgba(255, 255, 255, 0.6);\n" +
"            border-right: outset rgba(0, 0, 0, 0.6);\n" +
"        }\n" +
"\n" +
"        .profile_name {\n" +
"            text-transform: uppercase;\n" +
"            overflow: hidden;\n" +
"\n" +
"\n" +
"        }\n" +
"\n" +
"\n" +
"        .profile_left {\n" +
"            width: 80%;\n" +
"            float: left;\n" +
"        }\n" +
"\n" +
"        .profile_right {\n" +
"            width: 20%;\n" +
"            float: right;\n" +
"        }\n" +
"\n" +
"        .profile_right img {\n" +
"\n" +
"            float: right;\n" +
"        }\n" +
"\n" +
"        .profile-level {\n" +
"            padding: 0px;\n" +
"        }\n" +
"\n" +
"        .profile_level {\n" +
"            padding-right: 5px;\n" +
"            overflow: hidden;\n" +
"            width: 100%;\n" +
"        }\n" +
"\n" +
"        .profile_level img {\n" +
"            float: right;\n" +
"            padding: 0px;\n" +
"        }\n" +
"\n" +
"        .profile_level_xyz {\n" +
"            padding-right: 5px;\n" +
"            overflow: hidden;\n" +
"            width: 100%;\n" +
"        }\n" +
"\n" +
"        .profile_level_xyz img {\n" +
"            float: left;\n" +
"            padding: 0px;\n" +
"        }\n" +
"\n" +
"        .profile_spell {\n" +
"            float: right;\n" +
"        }\n" +
"\n" +
"        .profile-img {\n" +
"            border-radius: 0px;\n" +
"            overflow: hidden;\n" +
"            padding-left: 5px;\n" +
"            padding-top: 5px;\n" +
"            padding-right: 5px;\n" +
"            padding-bottom: 1px;\n" +
"            background: rgb(54, 53, 53);\n" +
"            margin: 7px 7px;\n" +
"\n" +
"        }\n" +
"\n" +
"        .profile_img {\n" +
"            border-radius: 1px;\n" +
"            margin: 2px 2px 2px 2px;\n" +
"        }\n" +
"\n" +
"        .profile_desc {\n" +
"            background: rgba(255, 255, 255, 0.7);\n" +
"            overflow: hidden;\n" +
"            margin-top: 5px;\n" +
"            border-radius: 0px;\n" +
"            border: solid 3px rgb(219, 58, 58, 0.8);\n" +
"            position: relative;\n" +
"            display: flex;\n" +
"            flex-direction: column;\n" +
"        }\n" +
"\n" +
"        .profile_desc h4 {\n" +
"            font-size: 10.7px;\n" +
"            font-weight: bold;\n" +
"            position: relative;\n" +
"        }\n" +
"\n" +
"        .profile_desc p {\n" +
"            font-size: 10px;\n" +
"            padding: 2px;\n" +
"            width: auto;\n" +
"            position: relative;\n" +
"\n" +
"        }\n" +
"\n" +
"        .profile_attack p {\n" +
"            text-align: right;\n" +
"        }\n" +
"\n" +
"\n" +
"        .profile_attack {\n" +
"            margin: 3px;\n" +
"            font-weight: bold;\n" +
"            border-top: solid #000;\n" +
"            margin-top: auto;\n" +
"            float: right;\n" +
"\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <header>\n" +
"        <h1>Custom Deck de YU-GI-OH</h1>\n" +
"\n" +
"    </header>\n" +
"    <main>\n" +
"        <div class=\"container\">\n" +
"            <div class=\"gallery-wraper\">\n" +
"                <div class=\"gallery\">");
       
        for(int i=0;i<ctx.tipo_carta.size();i++){
            switch(ctx.tipo_carta.get(i).getText()){
                
                case "MONSTRO-NORMAL":
                    saida.append("<br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_monster_normal\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n"+
        "<div class=\"profile_right\">\n");
                    break;
                    
                case "MONSTRO-EFEITO":
                    saida.append("<br>\n" +
     "<div class=\"Profile\">\n" +
"        <div class=\"profile_monster_effect\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                    break;
                 
                case "MONSTRO-XYZ":
                    saida.append("<br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_monster_xyz\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname_xyz\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                    
                    break;
                    
                    case "MONSTRO-XYZ-EFEITO":
                    saida.append("<br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_monster_xyz\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname_xyz\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                    
                    break;
                    
                     case "MONSTRO-RITUAL":
                    saida.append("<div class=\"Profile\">\n" +
"        <div class=\"profile_monster_ritual\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname_ritual\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                    
                    break;
                    
                case "MONSTRO-RITUAL-EFEITO":
                    saida.append("<div class=\"Profile\">\n" +
"        <div class=\"profile_monster_ritual\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname_ritual\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                    
                    break;
                
                case "MONSTRO-FUSAO":
                    saida.append(" <br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_monster_fusion\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname_fusion\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                      break;
                
                      case "MONSTRO-FUSAO-EFEITO":
                    saida.append(" <br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_monster_fusion\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname_fusion\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                      break;
                      
                case "MONSTRO-SINCRO":
                    saida.append("<br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_monster_sincro\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                    break;
                 case "MONSTRO-SINCRO-EFEITO":
                    saida.append("<br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_monster_sincro\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.monstro_nome.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">");
                    break;
               
            }
            
            switch(ctx.atributo.get(i).getText()){
                case "TREVAS":
                    saida.append("<img src=\"imagens_site/trevas.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>");
                    break;
                    
                case "FOGO":
                    saida.append("<img src=\"imagens_site/fogo.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>");
                    break;
                case "TERRA":
                    saida.append("<img src=\"imagens_site/terra.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>");
                    break;
                    
                case "LUZ":
                    saida.append("<img src=\"imagens_site/luz.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>");
                    break;
                    
                case "VENTO":
                    saida.append("<img src=\"imagens_site/vento.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>");
                    break;  
                    
                case "AGUA":
                    saida.append("<img src=\"imagens_site/agua.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>");
                    break;
                 
                case "DIVINO":
                    saida.append("<img src=\"imagens_site/divino.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>");
                    break;
            }
            
            if(ctx.tipo_carta.get(i).getText().equals("MONSTRO-XYZ")||ctx.tipo_carta.get(i).getText().equals("MONSTRO-XYZ-EFEITO")){
                saida.append(" <div class=\"profile_level_xyz\">\n" +
"                <div class=\"profile-level\" id=\"image-container-xyz\">");
            }else{
                saida.append("<div class=\"profile_level\">\n" +
"                <div class=\"profile-level\" id=\"image-container\">");
            }
            if(ctx.tipo_carta.get(i).getText().equals("MONSTRO-XYZ")||ctx.tipo_carta.get(i).getText().equals("MONSTRO-XYZ-EFEITO")){
                for(int j =0;j<Integer.parseInt(ctx.level.get(i).getText());j++){
                    saida.append(" <img src=\"imagens_site/rank.jpg\" style=\"width: 20px;\">");
                }
            }else{
               for(int j =0;j<Integer.parseInt(ctx.level.get(i).getText());j++){
                saida.append(" <img src=\"imagens_site/Level.jpg\" style=\"width: 20px;\">");
                } 
            }
            
            
           
            switch (ctx.tipo_carta.get(i).getText()){
                case "MONSTRO-NORMAL":
                    saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    break;
                    
                case "MONSTRO-EFEITO":
                   saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/EFEITO]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    break;
                 
                case "MONSTRO-XYZ":
                    saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/XYZ]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    
                    break;
                     case "MONSTRO-XYZ-EFEITO":
                    saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/XYZ/EFEITO]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    
                    break;
                    
                case "MONSTRO-RITUAL":
                   saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/RITUAL]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    
                    break;
                
                    case "MONSTRO-RITUAL-EFEITO":
                   saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/RITUAL/EFEITO]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    
                    break;
                case "MONSTRO-FUSAO":
                    saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/FUSÃO]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                      break;
                
                case "MONSTRO-FUSAO-EFEITO":
                    saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/FUSÃO/EFEITO]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                      break;
                      
                case "MONSTRO-SINCRO":
                    saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/SINCRO]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    break;
                    
                     case "MONSTRO-SINCRO-EFEITO":
                    saida.append(" </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <h4>["+ctx.tipo.get(i).getText()+"/SINCRO/EFEITO]</h4>\n" +
"                    <p>"+ctx.desc.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"                <div class=\"profile_attack\"></div>\n" +
"                <p style=\"float:right;padding:3px; text-align: right;\">ATK/ "+ctx.atk.get(i).getText()+" DEF/ "+ctx.def.get(i).getText()+"</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    break;
            }
       
        
        }
        
        for(int i =0;i<ctx.tipo_cartam.size();i++){
            switch(ctx.tipo_cartam.get(i).getText()){
                case "MAGIA-NORMAL":
                   saida.append("<br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_normal_spell\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/SPELL.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">[SPELL CARD]</h4>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    break;
                    
                case "MAGIA-CONTINUA" :
                    
                    saida.append("<div class=\"Profile\">\n" +
"        <div class=\"profile_spell_continuous\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/SPELL.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">]</h4>\n" +
"                <img src=\"imagens_site/Continuous.jpg\" width=\" 20px\">\n" +
"                <h4 class=\"profile_spell\">[SPELL CARD</h4>\n" +
"\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    
                    break;
                    
                case "MAGIA-EQUIPAMENTO":
                    saida.append("<div class=\"Profile\">\n" +
"        <div class=\"profile_spell_equip\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/SPELL.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">]</h4>\n" +
"                <img src=\"imagens_site/Equip.jpg\" width=\" 20px\">\n" +
"                <h4 class=\"profile_spell\">[SPELL CARD</h4>\n" +
"\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div> \n"+"<br>");
                    break;
                 
                case "MAGIA-CAMPO":
                    saida.append("<div class=\"Profile\">\n" +
"        <div class=\"profile_spell_field\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/SPELL.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">]</h4>\n" +
"                <img src=\"imagens_site/Field.jpg\" width=\" 20px\">\n" +
"                <h4 class=\"profile_spell\">[SPELL CARD</h4>\n" +
"\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    <br>");
                    
                    break;
                    
                case "MAGIA-RITUAL":
                    saida.append("<div class=\"Profile\">\n" +
"        <div class=\"profile_spell_ritual\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/SPELL.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">]</h4>\n" +
"                <img src=\"imagens_site/Ritual.jpg\" width=\" 20px\">\n" +
"                <h4 class=\"profile_spell\">[SPELL CARD</h4>\n" +
"\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");
                    
                    break;
                    
                case "MAGIA-RAPIDA":
                    saida.append("<div class=\"Profile\">\n" +
"        <div class=\"profile_spell_quick\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/SPELL.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">]</h4>\n" +
"                <img src=\"imagens_site/Quick.jpg\" width=\" 20px\">\n" +
"                <h4 class=\"profile_spell\">[SPELL CARD</h4>\n" +
"\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <br>");                   
                    
                    break;
                       
                case "CARTA-ARMADILHA":
                    saida.append("<br>\n" +
"\n" +
"    <div class=\"Profile\">\n" +
"        <div class=\"profile_counter_trap\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/Trap.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">[TRAP CARD]</h4>\n" +
"\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>");
                    break;
                    
                case "ARMADILHA-CONTINUA":
                    
                    saida.append(" <div class=\"Profile\">\n" +
"        <div class=\"profile_continuous_trap\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/Trap.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">]</h4>\n" +
"                <img src=\"imagens_site/Continuous.jpg\" width=\" 20px\">\n" +
"                <h4 class=\"profile_spell\">[TRAP CARD</h4>\n" +
"\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    <br>");
                    
                    break;
                case "ARMADILHA-RESPOSTA":
                    saida.append("<div class=\"Profile\">\n" +
"        <div class=\"profile_counter_trap\">\n" +
"            <div class=\"profile-name\">\n" +
"                <div class=\"profile_name\">\n" +
"                    <div class=\"profile_left\">\n" +
"                        <p class=\"pname\">"+ctx.magic_mone.get(i).getText().replace("\"","")+"</p>\n" +
"                    </div>\n" +
"                    <div class=\"profile_right\">\n" +
"                        <img src=\"imagens_site/Trap.jpg\" width=\" 25px\">\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_level\">\n" +
"                <h4 class=\"profile_spell\">]</h4>\n" +
"                <img src=\"imagens_site/Counter.jpg\" width=\" 20px\">\n" +
"                <h4 class=\"profile_spell\">[TRAP CARD</h4>\n" +
"\n" +
"            </div>\n" +
"\n" +
"            <div class=\"profile_img\">\n" +
"                <div class=\"profile-img\">\n" +
"                    <img src=\"imagens/"+ctx.magic_png.get(i).getText().replace("\"","")+"\" width=\"100%\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"profile_desc\">\n" +
"                <div class=\"profile-desc\">\n" +
"                    <p>"+ctx.desc_m.get(i).getText().replace("\"","")+"</p>\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>");
                    break;
            }
            
        }
        
         saida.append("  </div>\n" +
"\n" +
"                                                    </div>\n" +
"                                                </div>\n" +
"                                                <script>\n" +
"                                                    const containers = document.querySelectorAll('.profile_name');\n" +
"                                                    const texts = document.querySelectorAll('.pname');\n" +
"\n" +
"                                                    texts.forEach((text, index) => {\n" +
"                                                        const container = containers[index];\n" +
"\n" +
"                                                        const adjustTextSize = () => {\n" +
"                                                            const containerHeight = container.offsetHeight;\n" +
"                                                            const textHeight = text.offsetHeight;\n" +
"\n" +
"                                                            text.style.fontSize = 'initial'; // Redefine o tamanho da fonte para o tamanho inicial\n" +
"                                                            text.style.transform = 'scaleY(4)'; // Redefine a transformação scaleY para o valor inicial\n" +
"\n" +
"                                                            while (text.scrollWidth > container.offsetWidth - 22) {\n" +
"                                                                let fontSize = parseInt(window.getComputedStyle(text).fontSize);\n" +
"                                                                fontSize -= 2;\n" +
"                                                                text.style.fontSize = `${fontSize}px`;\n" +
"                                                            }\n" +
"\n" +
"                                                            const newHeight = containerHeight / textHeight;\n" +
"                                                            text.style.transform = `scaleY(${newHeight + 0.7})`; // Ajusta o scaleY proporcionalmente\n" +
"                                                        };\n" +
"\n" +
"                                                        adjustTextSize(); // Ajusta o tamanho do texto inicialmente\n" +
"\n" +
"                                                        // Verifica se o tamanho do texto precisa ser ajustado ao redimensionar a janela\n" +
"                                                        window.addEventListener('resize', adjustTextSize);\n" +
"                                                    });\n" +
"\n" +
"\n" +
"                                                    const containers_xyz = document.querySelectorAll('.profile_name');\n" +
"                                                    const texts_xyz = document.querySelectorAll('.pname_xyz');\n" +
"\n" +
"                                                    texts_xyz.forEach((text, index) => {\n" +
"                                                        const container = containers_xyz[index];\n" +
"\n" +
"                                                        const adjustTextSize = () => {\n" +
"                                                            const containerHeight = container.offsetHeight;\n" +
"                                                            const textHeight = text.offsetHeight;\n" +
"\n" +
"                                                            text.style.fontSize = 'initial';\n" +
"                                                            text.style.transform = 'scaleY(4)';\n" +
"\n" +
"                                                            while (text.scrollWidth > container.offsetWidth - 22) {\n" +
"                                                                let fontSize = parseInt(window.getComputedStyle(text).fontSize);\n" +
"                                                                fontSize -= 2;\n" +
"                                                                text.style.fontSize = `${fontSize}px`;\n" +
"                                                            }\n" +
"\n" +
"                                                            const newHeight = containerHeight / textHeight;\n" +
"                                                            text.style.transform = `scaleY(${newHeight + 0.7})`;\n" +
"                                                        };\n" +
"\n" +
"                                                        adjustTextSize();\n" +
"                                                        window.addEventListener('resize', adjustTextSize);\n" +
"                                                    });\n" +
"\n" +
"\n" +
"\n" +
"                                                    const containers_fusion = document.querySelectorAll('.profile_name');\n" +
"                                                    const texts_fusion = document.querySelectorAll('.pname_fusion');\n" +
"\n" +
"                                                    texts_fusion.forEach((text, index) => {\n" +
"                                                        const container = containers_fusion[index];\n" +
"\n" +
"                                                        const adjustTextSize = () => {\n" +
"                                                            const containerHeight = container.offsetHeight;\n" +
"                                                            const textHeight = text.offsetHeight;\n" +
"\n" +
"                                                            text.style.fontSize = 'initial';\n" +
"                                                            text.style.transform = 'scaleY(4)';\n" +
"\n" +
"                                                            while (text.scrollWidth > container.offsetWidth - 22) {\n" +
"                                                                let fontSize = parseInt(window.getComputedStyle(text).fontSize);\n" +
"                                                                fontSize -= 2;\n" +
"                                                                text.style.fontSize = `${fontSize}px`;\n" +
"                                                            }\n" +
"\n" +
"                                                            const newHeight = containerHeight / textHeight;\n" +
"                                                            text.style.transform = `scaleY(${newHeight + 0.7})`;\n" +
"                                                        };\n" +
"\n" +
"                                                        adjustTextSize();\n" +
"                                                        window.addEventListener('resize', adjustTextSize);\n" +
"                                                    });\n" +
"\n" +
"\n" +
"                                                    const containers_ritual = document.querySelectorAll('.profile_name');\n" +
"                                                    const texts_ritual = document.querySelectorAll('.pname_ritual');\n" +
"\n" +
"                                                    texts_ritual.forEach((text, index) => {\n" +
"                                                        const container = containers_ritual[index];\n" +
"\n" +
"                                                        const adjustTextSize = () => {\n" +
"                                                            const containerHeight = container.offsetHeight;\n" +
"                                                            const textHeight = text.offsetHeight;\n" +
"\n" +
"                                                            text.style.fontSize = 'initial';\n" +
"                                                            text.style.transform = 'scaleY(4)';\n" +
"\n" +
"                                                            while (text.scrollWidth > container.offsetWidth - 22) {\n" +
"                                                                let fontSize = parseInt(window.getComputedStyle(text).fontSize);\n" +
"                                                                fontSize -= 2;\n" +
"                                                                text.style.fontSize = `${fontSize}px`;\n" +
"                                                            }\n" +
"\n" +
"                                                            const newHeight = containerHeight / textHeight;\n" +
"                                                            text.style.transform = `scaleY(${newHeight + 0.7})`;\n" +
"                                                        };\n" +
"\n" +
"                                                        adjustTextSize();\n" +
"                                                        window.addEventListener('resize', adjustTextSize);\n" +
"                                                    });\n" +
"\n" +
"\n" +
"\n" +
"                                                    const profileDescs = document.querySelectorAll('.profile_desc');\n" +
"                                                    let maxHeight = 0;\n" +
"\n" +
"                                                    profileDescs.forEach((desc) => {\n" +
"                                                        const text = desc.querySelector('.profile-desc');\n" +
"                                                        const textHeight = text.clientHeight;\n" +
"\n" +
"                                                        if (textHeight > maxHeight) {\n" +
"                                                            maxHeight = textHeight;\n" +
"                                                        }\n" +
"                                                    });\n" +
"\n" +
"                                                    profileDescs.forEach((desc) => {\n" +
"                                                        desc.style.height = `${maxHeight + 30}px`;\n" +
"                                                    });\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"                                                </script>\n" +
"\n" +
"    </main>\n" +
"    <footer>\n" +
"        &copy; Árlisson Alves da Silva Silveira 2023.\n" +
"        reservados.\n" +
"    </footer>\n" +
"</body>\n" +
"\n" +
"\n" +
"</html>");
        return null;
        
        
        
        
        
        
        }  
    }
       
    
    
    
    

