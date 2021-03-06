USE [PRUEBA_CPS]
GO
/****** Object:  Table [dbo].[tc_codigo]    Script Date: 24/06/2022 00:21:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tc_codigo](
	[id_codigo] [bigint] NOT NULL,
	[codigo] [nchar](20) NOT NULL,
	[descuento] [nchar](10) NOT NULL,
	[estado] [int] NULL,
 CONSTRAINT [PK_tc_codigo] PRIMARY KEY CLUSTERED 
(
	[id_codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tc_pais]    Script Date: 24/06/2022 00:21:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tc_pais](
	[id_pais] [bigint] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](255) NOT NULL,
	[tarifa] [bigint] NOT NULL,
	[id_region] [bigint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_pais] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tc_region]    Script Date: 24/06/2022 00:21:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tc_region](
	[id_region] [bigint] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_region] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[tc_codigo] ([id_codigo], [codigo], [descuento], [estado]) VALUES (1, N'XYZABC              ', N'5         ', 1)
INSERT [dbo].[tc_codigo] ([id_codigo], [codigo], [descuento], [estado]) VALUES (2, N'ZZRRXX              ', N'10        ', 1)
GO
SET IDENTITY_INSERT [dbo].[tc_pais] ON 

INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (4, N'ESTADOS UNIDOS', 10, 7)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (5, N'MEXICO', 10, 7)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (8, N'JAPON', 10, 8)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (9, N'CHINA', 10, 8)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (10, N'MALASIA', 10, 8)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (11, N'AUSTRALIA', 10, 9)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (12, N'SAMOA', 10, 9)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (13, N'NIGERIA', 5, 10)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (14, N'KENIA', 10, 10)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (15, N'MARRUECOS', 10, 10)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (16, N'UGANDA', 10, 10)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (18, N'BRAZIL', 10, 11)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (19, N'COLOMBIA', 10, 11)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (20, N'CHILE', 10, 11)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (21, N'GUATEMALA', 10, 12)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (22, N'NICARAGUA', 10, 12)
INSERT [dbo].[tc_pais] ([id_pais], [nombre], [tarifa], [id_region]) VALUES (23, N'HONDURAS', 10, 12)
SET IDENTITY_INSERT [dbo].[tc_pais] OFF
GO
SET IDENTITY_INSERT [dbo].[tc_region] ON 

INSERT [dbo].[tc_region] ([id_region], [nombre]) VALUES (7, N'Norte América')
INSERT [dbo].[tc_region] ([id_region], [nombre]) VALUES (8, N'Asia')
INSERT [dbo].[tc_region] ([id_region], [nombre]) VALUES (9, N'Oceanía')
INSERT [dbo].[tc_region] ([id_region], [nombre]) VALUES (10, N'África')
INSERT [dbo].[tc_region] ([id_region], [nombre]) VALUES (11, N'Suramérica')
INSERT [dbo].[tc_region] ([id_region], [nombre]) VALUES (12, N'Centro América')
SET IDENTITY_INSERT [dbo].[tc_region] OFF
GO
